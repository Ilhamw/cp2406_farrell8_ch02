import java.util.Scanner;
public class NauticleMilesInteractive
{
    public static void main(String[] args)
    {
        final double kilometers = 1.852;
        final double miles = 1.150779;
        int nauticaleMile = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nauticle mile>>> ");
        nauticaleMile = input.nextInt();
        double kmConvert;
        double mileConvert;
        kmConvert = nauticaleMile * kilometers;
        mileConvert = nauticaleMile * miles;
        System.out.println(nauticaleMile + " nauticle miles = " + kmConvert + "km or " + mileConvert + "miles");
    }
}
