public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void stop(){
        System.out.println(this.name + " stops");
    }
}
