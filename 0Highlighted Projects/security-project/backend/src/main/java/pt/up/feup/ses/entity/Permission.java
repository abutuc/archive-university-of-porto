package pt.up.feup.ses.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pt.up.feup.ses.types.PermissionType;
import pt.up.feup.ses.types.ResourceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "permissions")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Permission extends PanacheEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "resource_type", nullable = false)
    private ResourceType resourceType;

    @Column(name = "resource_id", nullable = false)
    private String resourceId;

    @Column(name = "permission_type", nullable = false)
    private PermissionType permissionType;
}
