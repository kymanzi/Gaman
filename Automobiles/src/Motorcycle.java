public class Motorcycle extends Vehicle implements Drivable{
    public Motorcycle() {
        super("Motorcycle");
    }

    public Motorcycle(String name) {
        super(name);
    }

    public void revEngine(){
        System.out.println(this.name + " revs loudly");
    }

    @java.lang.Override
    public void drive() {
        revEngine();
    }
}
