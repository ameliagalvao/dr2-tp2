import java.util.UUID;
import java.util.regex.Pattern;

public final class User {
    private final UUID id;
    private final String name;
    private final String email;
    private final String role;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public User(UUID id, String name, String email, String role) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public User updateEmail(String newEmail) {
        return new User(this.id, this.name, newEmail, this.role);
    }

    public User setRole(String newRole) {
        return new User(this.id, this.name, this.email, newRole);
    }

}
