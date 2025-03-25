import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Sprint {
    private UUID id;
    private String name;
    private Date startDate;
    private Date endDate;
    private ArrayList<Task> taskList;

    private void addTask(Task task) {};

    private void removeTask(Task task) {};

    private ArrayList<Task> getTaskList() {
        return taskList;
    };

    public UUID getId() {
        return id;
    };
}
