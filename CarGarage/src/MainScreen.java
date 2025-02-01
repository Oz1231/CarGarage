import java.util.List;
import java.util.Scanner;

public class MainScreen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a vehicle: 1 for Motorcycle, 2 for Car, 3 for Truck, 0 to stop");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                break;
            }

            System.out.println("Enter the vehicle name:");
            String name = scanner.nextLine();

            DB.build(choice, name);
        }

        List<Vehicle> vehicles = DB.convert();


        Protocol_Garage protocolGarage = new Protocol_Garage() {
            @Override
            public void fixed(Vehicle vehicle) {
                System.out.println(vehicle.getName() + " has been successfully repaired!");
            }
        };

        Garage garage = new Garage(protocolGarage, vehicles);
        garage.startRepairing();
    }
}
