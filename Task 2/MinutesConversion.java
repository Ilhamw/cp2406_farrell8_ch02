import java.util.Scanner;
public class MinutesConversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time in minutes>>> ");
        int minutes = input.nextInt();
        double hours = minutes / 60;
        double days = hours / 24;
        System.out.println(minutes + " minutes equals to " + String.format("% .2f",hours) + " hours and " + String.format("% .3f",days) + " days.");
    }
}
