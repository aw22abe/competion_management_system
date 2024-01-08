public class Staff {
    private String name;
    private String accessLevel;

    // Constructor
    public Staff(String name, String accessLevel) {
        this.name = name;
        this.accessLevel = accessLevel;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    // Setter methods (if needed)
    public void setName(String name) {
        this.name = name;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    // Other methods (if needed)

    @Override
    public String toString() {
        return "Name: " + name + ", Access Level: " + accessLevel;
    }
}
