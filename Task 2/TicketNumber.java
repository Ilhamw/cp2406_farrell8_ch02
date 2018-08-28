import javax.swing.JOptionPane;
public class TicketNumber
{
    public static void main(String[] args)
    {
        final int CHECKDIGIT = 7;
        String ticketString;
        int ticketNum;
        ticketString = JOptionPane.showInputDialog(null,
                "Enter 6-digit ticket number", "Ticket Number Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        ticketNum = Integer.parseInt(ticketString);
        int ticketPrompt = ticketNum % 10;
        int newTicketNum = ticketNum / 10;
        int remainder = newTicketNum % CHECKDIGIT;
        boolean result = (remainder == ticketPrompt);
        JOptionPane.showMessageDialog(null,"For ticket number " +
                ticketNum + ", last digit is " + ticketPrompt +
                " and remainder is " + remainder + ",\nso result is " +
                result);
    }
}
