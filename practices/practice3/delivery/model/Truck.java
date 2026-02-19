package practices.practice3.delivery.model;

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(String model, double baseCost, Engine engine, double maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() + (maxLoad * 0.8);
    }

    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return calculateDeliveryCost() + (distance / engine.horsePower * fuelPrice);
    }
}