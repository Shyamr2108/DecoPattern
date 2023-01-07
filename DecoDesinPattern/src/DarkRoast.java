public class DarkRoast extends Beverages{
    public DarkRoast(String description) {
        super(description);
    }
    @Override
    public double cost() {
        System.out.println("DarkRoast Cost is");
        return 40.5;
    }
}
