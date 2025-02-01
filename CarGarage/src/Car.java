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

    public static Car create(String model) {
        return new Car(model);
    }
}
