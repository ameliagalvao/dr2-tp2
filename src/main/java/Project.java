import java.util.ArrayList;
import java.util.UUID;

public class Project {
    private UUID id;
    private String name;
    private String description;
    private ArrayList<Sprint> sprintList;

    private void addSprint(Sprint sprint) {};

    private void removeSprint(Sprint sprint) {};

    private ArrayList<Sprint> getSprintList() {
        return sprintList;
    };

    public UUID getId() {
        return id;
    };
}
