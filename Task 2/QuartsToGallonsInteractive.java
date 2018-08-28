import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {

        final int QUARTS_IN_GALLON = 4;
        int quartsRequired = 18;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter amount of quarts in gallon >>> ");
        quartsRequired = inputDevice.nextInt();
        int gallonsRequired;
        int extraQuartsRequired;
        gallonsRequired = quartsRequired / QUARTS_IN_GALLON;
        extraQuartsRequired = quartsRequired % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsRequired +
                " quarts requires " + gallonsRequired + " gallons plus " +
                extraQuartsRequired + " quarts.");
    }
}