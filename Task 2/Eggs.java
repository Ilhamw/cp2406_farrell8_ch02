public class Eggs
{
    public static void main(String[] args)
    {
        final int EGGS_PER_DOZEN = 12;
        double dozenCost = 3.25;
        double looseCost = 0.45;
        int eggs = 27;
        int dozens = eggs / EGGS_PER_DOZEN;
        int remainderEggs = eggs % EGGS_PER_DOZEN;
        double dozenTotal = dozens * dozenCost;
        double looseTotal = remainderEggs * looseCost;
        double totalCost = dozens * dozenCost + remainderEggs * looseCost;
        System.out.println("You ordered " + eggs + " eggs. That's " + dozens + " dozen at $" + dozenCost + " and "
                        + remainderEggs + " loose eggs at $" + looseCost + " for a total of $" + totalCost + ".");
    }
}
