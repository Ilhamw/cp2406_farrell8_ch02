import java.util.Scanner;
public class ChiliToGo
{
    public static void main(String[] args)
    {
        final int adultPrice = 7;
        final int childPrice = 4;
        int adultTotal;
        int childTotal;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of orders for adult meal>>> ");
        adultTotal = input.nextInt() * adultPrice;
        System.out.println("Enter number of orders for child meal>>> ");
        childTotal = input.nextInt() * childPrice;
        int totalPrice = adultTotal + childTotal;
        System.out.println("Total money collected for adult meals: $" + adultTotal);
        System.out.println("Total money collected for child meals: $" + childTotal);
        System.out.println("Total money collected for all meals: $" + totalPrice);
    }
}
