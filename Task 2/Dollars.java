import java.util.Scanner;
public class Dollars
{
    public static void main(String[] args)
    {
        final int twenties = 20;
        final int tens = 10;
        final int fives = 5;
        int totalMoney;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of money>>> ");
        totalMoney = input.nextInt();
        int twentiesNum = totalMoney / twenties;
        int tensNum = (totalMoney - 20 * twentiesNum) / tens;
        int fivesNum = (totalMoney - 20 * twentiesNum - 10 * tensNum) /fives;
        int onesNum = (totalMoney - 20 * twentiesNum - 10 * tensNum - 5 * fivesNum);
        System.out.println("Total amount: $" + totalMoney);
        System.out.println("Number of 20s: " + twentiesNum);
        System.out.println("Number of 10s: " + tensNum);
        System.out.println("Number of 5s: " + fivesNum);
        System.out.println("Number of 1s: " + onesNum);
    }
}
