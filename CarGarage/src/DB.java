import java.util.*;

public class DB {

    static HashMap<Integer, Queue<Vehicle>> vehicleQueues = new HashMap<>();

    static {
        vehicleQueues.put(1, new LinkedList<>());
        vehicleQueues.put(2, new LinkedList<>());
        vehicleQueues.put(3, new LinkedList<>());
    }

    public static void build(int type, String model) {
        Vehicle vehicle = null;

        switch (type) {
            case 1:
                vehicle = Motorcycle.create(model);
                break;
            case 2:
                vehicle = Car.create(model);
                break;
            case 3:
                vehicle = Truck.create(model);
                break;
            default:
                System.out.println("Invalid vehicle type.");
                return;
        }

        vehicleQueues.get(type).offer(vehicle);
    }

    public static List<Vehicle> convert() {
        List<Vehicle> allVehicles = new ArrayList<>();

        for (Queue<Vehicle> queue : vehicleQueues.values()) {
            allVehicles.addAll(queue);
        }

        return allVehicles;
    }


}
