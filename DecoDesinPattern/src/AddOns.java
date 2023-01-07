public abstract  class AddOns extends Beverages{


    private Beverages beverage;

    public AddOns(Beverages beverageType,String description) {
        super(description);
        this.beverage=beverageType;
    }

    public abstract String description();
}
