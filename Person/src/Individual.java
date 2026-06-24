public abstract class Individual {

    private String name;

    public Individual(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void healthy() {
        System.out.println(this.name + " is healthy");
    }
}
