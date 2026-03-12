package labs.lab2.problem5.model;

public class PhDStudent extends Student {

    private final String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        if (researchTopic == null || researchTopic.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    protected boolean canAcceptPet(Animal pet) {
        return super.canAcceptPet(pet) && !(pet instanceof Dog);
    }

    @Override
    public String getOccupation() {
        return "PhD student (" + getMajor() + ", research: " + researchTopic + ")";
    }
}
