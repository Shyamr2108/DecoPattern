public class HouseBlend extends Beverages{

    public HouseBlend(String description){
        super(description);
    }

    @Override
    public double cost() {
        System.out.println("cost of HouseBlend is ");
        return 102.1;
    }
}
