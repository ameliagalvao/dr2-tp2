import java.util.UUID;

public final class Task {
    private final UUID id;
    private final String title;
    private final String description;
    private final TaskSatus status;

    public Task(UUID id, String title, String description, TaskSatus status) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskSatus getStatus() {
        return status;
    }

    private Task changeStatus(TaskSatus newStatus) {
        return new Task(this.id, this.title, this.description, newStatus);
    };

    private String showDetails() {
        return "Task [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + "]";
    };

}
