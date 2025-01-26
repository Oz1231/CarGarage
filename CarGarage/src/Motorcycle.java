public class Motorcycle extends Vehicle{


    public Motorcycle(String name) {
        super(name);
    }

    @Override
    int  getFixTime() {
        return 3;
    }

    @Override
    public void fixed() {
        System.out.println(getName() + " 2 wheels repaired");

    }
}
