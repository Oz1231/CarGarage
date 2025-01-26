import java.util.Scanner;

public class MainScreen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle;

        while (true) {
            System.out.println("Choose a vehicle: 1 for Motorcycle, 2 for Car, 3 for Truck, 0 to stop");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            scanner.nextLine();

            System.out.println("Enter the vehicle name:");
            String name = scanner.nextLine();

            switch (choice) {
                case 1:
                    vehicle = new Motorcycle(name);
                    break;
                case 2:
                    vehicle = new Car(name);
                    break;
                case 3:
                    vehicle = new Truck(name);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            DB.addVehicle(vehicle);
        }

        Protocol_Garage protocolGarage = new Protocol_Garage() {
            @Override
            public void fixed(Vehicle vehicle) {
                System.out.println(vehicle.getName() + " has been successfully repaired!");
            }
        };

        Garage garage = new Garage(protocolGarage);
        garage.startRepairing();
    }
}
