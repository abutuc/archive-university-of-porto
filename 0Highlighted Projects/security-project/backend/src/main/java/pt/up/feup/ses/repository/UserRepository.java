package pt.up.feup.ses.repository;

import java.util.Optional;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import pt.up.feup.ses.entity.User;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User, String> {
    public User save(User user) {
        persist(user);
        return user;
    }

    public Optional<User> findByUsername(String username) {
        return find("username", username).firstResultOptional();
    }

    public Optional<User> findByEmail(String email) {
        return find("email", email).firstResultOptional();
    }
}
