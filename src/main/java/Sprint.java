import java.util.*;

public final class Sprint {
    private final UUID id;
    private final String name;
    private final Date startDate;
    private final Date endDate;
    private final List<Task> taskList;

    public Sprint(UUID id, String name, Date startDate, Date endDate, List<Task> taskList) {
        this.id = UUID.randomUUID();
        this.name = name;
        // Cópia defensiva das datas para evitar modificação externa
        this.startDate = new Date(startDate.getTime());
        this.endDate = new Date(endDate.getTime());
        // Cópia imutável da lista de tarefas
        this.taskList = Collections.unmodifiableList(new ArrayList<>(taskList));
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return new Date(startDate.getTime());
    }

    public Date getEndDate() {
        return new Date(endDate.getTime());
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

}
