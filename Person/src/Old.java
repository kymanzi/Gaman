public class Old extends Individual implements Moving{

    public Old() {
        super("mzee");
    }

    public Old(String name) {
        super(name);
    }

    public void movement() {
        System.out.println(getName() + " walks with a stick");
    }

    @java.lang.Override
    public void move() {
        movement();
    }
}
