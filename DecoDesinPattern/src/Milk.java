public class Milk extends AddOns{

    public Milk(Beverages beverages,String description) {
        super(beverages,description);
    }
    @Override
    public String description() {
        return getDescription();
    }

    @Override
    public double cost() {
        System.out.println("cost of milk is");
        return 40.5;
    }
}
