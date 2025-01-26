import java.util.ArrayList;
import java.util.List;

    public class DB {

        static List<Vehicle> vehicles = new ArrayList<>();

        public static void addVehicle(Vehicle vehicle) {
            vehicles.add(vehicle);
        }

        public static List<Vehicle> getVehicles() {
            return vehicles;
        }
    }



