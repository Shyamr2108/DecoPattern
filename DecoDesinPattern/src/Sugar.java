public class Sugar extends AddOns {

    public Sugar(Beverages beverages,String description){
        super(beverages,description);

    }
    @Override
    public String description() {
        return getDescription();
    }

    @Override
    public double cost() {
        System.out.println("cost of sugar is ");
        return 50.15;
    }
}
