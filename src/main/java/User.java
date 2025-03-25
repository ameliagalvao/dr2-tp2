import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;
    private String role;

    public UUID getId() {
        return id;
    }

    private void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    private void setRole(String newRole) {
        this.role = newRole;
    }
}
