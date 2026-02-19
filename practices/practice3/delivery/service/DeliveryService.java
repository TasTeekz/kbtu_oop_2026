package practices.practice3.delivery.service;

import java.util.List;
import practices.practice3.delivery.model.Vehicle;

public class DeliveryService {
    public void printAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleInfo());
        }
    }

    public double calculateAllDeliveries(List<Vehicle> vehicles) {
        double totalCost = 0;
        for (Vehicle vehicle : vehicles) {
            totalCost += vehicle.calculateDeliveryCost();
        }
        return totalCost;
    }

    public double calculateTotalCost(List<Vehicle> vehicles) {
        double totalCost = 0;
        for (Vehicle vehicle : vehicles) {
            totalCost += vehicle.calculateDeliveryCost();
        }
        return totalCost;
    }
}