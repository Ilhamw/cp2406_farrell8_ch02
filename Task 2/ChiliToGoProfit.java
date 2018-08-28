import java.util.Scanner;
public class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        final double adultPrice = 7;
        final double adultCost = 4.35;
        final double childPrice = 4;
        final double childCost = 3.10;
        double adultTotal;
        double childTotal;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of orders for adult meal>>> ");
        adultTotal = input.nextInt() * (adultPrice - adultCost);
        System.out.println("Enter number of orders for child meal>>> ");
        childTotal = input.nextInt() * (childPrice - childCost);
        double totalPrice = adultTotal + childTotal;
        System.out.println("Total profit for adult meals: $" + String.format("% .2f",adultTotal));
        System.out.println("Total profit for child meals: $" + String.format("% .2f",childTotal));
        System.out.println("Total profit for all meals: $" + String.format("% .2f",totalPrice));
    }
}
