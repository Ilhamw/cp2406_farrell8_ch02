public class InchesToFeet
{
    public static void main(String[] args)
    {
        final int FEET_IN_INCHES = 12;
        int inches = 86;
        int feet;
        int remainderInches;
        feet = inches / FEET_IN_INCHES;
        remainderInches = inches % FEET_IN_INCHES;
        System.out.println(inches + " becomes " + feet + " feet and " + remainderInches + " inches");
    }
}
