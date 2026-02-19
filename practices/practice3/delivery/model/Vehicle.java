package practices.practice3.delivery.model;

public class Vehicle {
    protected String model;
    protected double baseCost;
    protected Engine engine;

    public Vehicle(String model, double baseCost, Engine engine) {
        this.model = model;
        this.baseCost = baseCost;
        this.engine = engine;
    }

    public double calculateDeliveryCost() {
        return baseCost + (engine.horsePower * 0.5);
    }

    public String getVehicleInfo() {
        return "model: " + model + ", base Cost: " + baseCost + ", engine: [" + engine.getEngineInfo() + "]";
    }
}