package practices.practice3.delivery.app;

import java.util.List;
import java.util.ArrayList;
import practices.practice3.delivery.model.*;
import practices.practice3.delivery.service.DeliveryService;

public class MainApp {
    public static void main(String[] args) {
        // at least two Engine objects
        Engine engine1 = new Engine("V8", 300);
        Engine engine2 = new Engine("V12", 450);

        // at least one Car and one Truck
        Car car1 = new Car("Chevrolet Cobalt", 150.0, engine1, 5);
        Truck truck1 = new Truck("GAS-53", 200.0, engine2, 5000.0);

        // vehicles in a List<Vehicle>
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(truck1);

        // create DeliveryService
        DeliveryService service = new DeliveryService();

        // test all functionality
        System.out.println("=== all vehicles ===");
        service.printAllVehicles(vehicles);

        System.out.println("\n=== calculate all deliveries ===");
        double totalDeliveries = service.calculateAllDeliveries(vehicles);
        System.out.println("total delivery cost: " + totalDeliveries);

        System.out.println("\n=== calculate total cost ===");
        double totalCost = service.calculateTotalCost(vehicles);
        System.out.println("total cost: " + totalCost);

        // demonstrate overloaded methods
        System.out.println("\n=== demonstrating overloaded methods ===");
        System.out.println("car delivery with extra weight (50kg): " + car1.calculateDeliveryCost(50.0));
        System.out.println("truck delivery with distance (200km) and fuel price (1.5): "
                + truck1.calculateDeliveryCost(200.0, 1.5));
    }
}