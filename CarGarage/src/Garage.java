import java.util.List;

public class Garage {

    private Protocol_Garage protocolGarage;
    private List<Vehicle> vehicles;

    public Garage(Protocol_Garage protocolGarage, List<Vehicle> vehicles) {
        this.protocolGarage = protocolGarage;
        this.vehicles = vehicles;
    }

    public void startRepairing() {

        for (Vehicle vehicle : vehicles) {
            int fixTime = vehicle.getFixTime();
            int elapsedTime = 0;

            System.out.println("Starting repair for " + vehicle.getName() + ". Estimated time: " + fixTime + " seconds.");

            while (elapsedTime < fixTime) {
                try {
                    Thread.sleep(1000);
                    elapsedTime++;
                    System.out.println(vehicle.getName() + " repair in progress... " + elapsedTime + "/" + fixTime + " seconds.");
                } catch (InterruptedException e) {
                    System.out.println("Repair interrupted for " + vehicle.getName());
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            protocolGarage.fixed(vehicle);
            vehicle.fixed();
        }

        System.out.println("All vehicles have been repaired!");
    }
}
