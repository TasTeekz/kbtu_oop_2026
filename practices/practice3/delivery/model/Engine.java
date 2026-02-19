package practices.practice3.delivery.model;

public class Engine {
    protected String type;
    protected double horsePower;

    public Engine(String type, double horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getEngineInfo() {
        return "type: " + type + ", horse power: " + horsePower;
    }
}