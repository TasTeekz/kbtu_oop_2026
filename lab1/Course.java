package lab1;

import java.util.ArrayList;

class Course {
    private String name;
    private String description;
    private int credits;
    private ArrayList<String> prerequisites;

    public Course(String name, String description, int credits) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = new ArrayList<>();
    }

    public Course(String name, String description, int credits, ArrayList<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredits() {
        return credits;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void addPrerequisite(String prerequisite) {
        prerequisites.add(prerequisite);
    }

    @Override
    public String toString() {
        return name + " - " + description + "\ncredits: " + credits +
                (prerequisites.isEmpty() ? "" : "\nprerequisites: " + String.join(", ", prerequisites));
    }
}
