package pt.up.feup.ses.types;

public enum PermissionType {
    VIEW("view"),
    EDIT("edit"),
    DELETE("delete");

    private final String type;

    PermissionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static PermissionType fromString(String type) {
        for (PermissionType permissionType : PermissionType.values()) {
            if (permissionType.type.equalsIgnoreCase(type)) {
                return permissionType;
            }
        }
        throw new IllegalArgumentException("No constant with text " + type + " found");
    }
}
