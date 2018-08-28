import java.util.Scanner;
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        final int FEET_IN_INCHES = 12;
        int inches = 86;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length in inches>>> ");
        inches = input.nextInt();
        int feet;
        int remainderInches;
        feet = inches / FEET_IN_INCHES;
        remainderInches = inches % FEET_IN_INCHES;
        System.out.println(inches + " becomes " + feet + " feet and " + remainderInches + " inches");
    }
}
