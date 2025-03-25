import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class Project {
    private final UUID id;
    private final String name;
    private final String description;
    private final List<Sprint> sprintList;

    public Project(UUID id, String name, String description, List<Sprint> sprintList) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.sprintList = Collections.unmodifiableList(new ArrayList<>(sprintList));
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Sprint> getSprintList() {
        return sprintList;
    }

    private Project addSprint(Sprint sprint) {
        List<Sprint> newSprintList = new ArrayList<>(this.sprintList);
        newSprintList.add(sprint);
        return new Project(this.id, this.name, this.description, newSprintList);
    };

    private Project removeSprint(Sprint sprint) {
        List<Sprint> newSprintList = new ArrayList<>(this.sprintList);
        newSprintList.remove(sprint);
        return new Project(this.id, this.name, this.description, newSprintList);
    };

}
