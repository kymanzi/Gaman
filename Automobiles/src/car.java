public class car extends Vehicle {

    public car(){
        super("car");
    }

    public car(String name) {
        super(name);
    }

    public void honk(){
        System.out.println(this.name + " honks");
    }

}
