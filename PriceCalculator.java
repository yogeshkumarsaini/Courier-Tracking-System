public class PriceCalculator {

    public static double calculate(double distance,double weight,String category){

        double price=(distance*5)+(weight*20);

        if(category.equalsIgnoreCase("Express"))
            price+=200;

        return price;
    }
}