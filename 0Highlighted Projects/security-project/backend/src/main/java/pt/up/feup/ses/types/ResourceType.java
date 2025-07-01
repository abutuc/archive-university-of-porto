package pt.up.feup.ses.types;

public enum ResourceType {
    FILE("file"),
    DIRECTORY("directory");

    private final String type;

    ResourceType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static ResourceType fromString(String type) {
        for (ResourceType resourceType : ResourceType.values()) {
            if (resourceType.type.equalsIgnoreCase(type)) {
                return resourceType;
            }
        }
        throw new IllegalArgumentException("No constant with text " + type + " found");
    }
}
