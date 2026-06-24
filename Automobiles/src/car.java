public class car extends Vehicle implements Drivable{

    public car(){
        super("car");
    }

    public car(String name) {
        super(name);
    }

    public void honk(){
        System.out.println(this.name + " honks");
    }

    @java.lang.Override
    public void drive() {
        honk();
    }
}
