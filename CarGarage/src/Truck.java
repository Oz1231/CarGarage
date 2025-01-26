public class Truck extends Vehicle{


    public Truck(String name) {
        super(name);
    }

    @Override
    int getFixTime() {
        return 10;
    }

    @Override
    public void fixed() {
        System.out.println(getName() + " 4 wheels and engine repaired");

    }
}
