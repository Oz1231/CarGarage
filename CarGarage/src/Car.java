public class Car extends Vehicle{


    public Car(String name) {
        super(name);
    }

    @Override
    int getFixTime() {
        return 5;
    }


    @Override
    public void fixed() {
        System.out.println(getName() + " 4 wheels repaired");

    }
}
