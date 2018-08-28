public class NauticalMiles
{
    public static void main(String[] args)
    {
        final double kilometers = 1.852;
        final double miles = 1.150779;
        final int nauticaleMile = 5;
        double kmConvert;
        double mileConvert;
        kmConvert = nauticaleMile * kilometers;
        mileConvert = nauticaleMile * miles;
        System.out.println(nauticaleMile + " nauticle miles = " + kmConvert + "km or " + mileConvert + "miles");
    }
}
