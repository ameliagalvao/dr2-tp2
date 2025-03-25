import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public final class Sprint {
    private final UUID id;
    private final String name;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final List<Task> taskList;

    public Sprint(UUID id, String name, LocalDateTime startDate, LocalDateTime endDate, List<Task> taskList) {
        this.id = UUID.randomUUID();
        this.name = name;
        // Cópia defensiva das datas para evitar modificação externa
        this.startDate = startDate;
        this.endDate = endDate;
        // Cópia imutável da lista de tarefas
        this.taskList = Collections.unmodifiableList(new ArrayList<>(taskList));
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    private Sprint addTask(Task task) {
        List<Task> newTaskList = new ArrayList<>(this.taskList);
        newTaskList.add(task);
        return new Sprint(this.id, this.name, this.startDate, this.endDate, newTaskList);
    };

    private Sprint removeTask(Task task) {
        List<Task> newTaskList = new ArrayList<>(this.taskList);
        newTaskList.remove(task);
        return new Sprint(this.id, this.name, this.startDate, this.endDate, newTaskList);
    };

    public long getSprintDurationInDays() {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}
