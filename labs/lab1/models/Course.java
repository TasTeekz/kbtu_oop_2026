package labs.lab1.models;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Course {
    private String name;
    private String description;
    private int credits;
    private ArrayList<Course> prerequisites;

    public Course(String name, String description, int credits) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = new ArrayList<>();
    }

    public Course(String name, String description, int credits, ArrayList<Course> prerequisites) {
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

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public void addPrerequisite(Course prerequisite) {
        prerequisites.add(prerequisite);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(" - ").append(description)
                .append("\ncredits: ").append(credits);

        if (!prerequisites.isEmpty()) {
            String prereqList = prerequisites.stream()
                    .map(Course::getName)
                    .collect(Collectors.joining(", "));
            result.append("\nprerequisites: ").append(prereqList);
        }

        return result.toString();
    }
}
