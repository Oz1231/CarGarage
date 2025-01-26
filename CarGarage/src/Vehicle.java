public abstract class Vehicle implements Fixable{

    abstract int getFixTime();

    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fixed() {
        System.out.println(this.name + " is being repaired");
    }

}
