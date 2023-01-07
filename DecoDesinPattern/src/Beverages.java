public abstract class Beverages {
    private String description;

    public Beverages(String description) {
        this.description=description;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
