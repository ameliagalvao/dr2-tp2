import java.util.UUID;

public class Task {
    private UUID id;
    private String title;
    private String description;
    private Enum<TaskSatus> status;

    private void changeStatus(TaskSatus newStatus) {};

    private void showDetails() {};

    private void setUser() {};

    public UUID getId() {
        return id;
    };
}
