public class Main {

    public static void main(String args[]){

        HouseBlend houseBlend=new HouseBlend("This is your houseblend coffee");
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());
        System.out.println("-----------------------------------------");

        DarkRoast darkRoast=new DarkRoast("This is your darkroast coffee");
        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());




    }
}
