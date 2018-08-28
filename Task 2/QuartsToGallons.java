public class QuartsToGallons
{
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALLON = 4;
        int quartsRequired = 18;
        int gallonsRequired;
        int extraQuartsRequired;
        gallonsRequired = quartsRequired / QUARTS_IN_GALLON;
        extraQuartsRequired = quartsRequired % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsRequired +
                " quarts requires " + gallonsRequired + " gallons plus " +
                extraQuartsRequired + " quarts.");
    }

}
