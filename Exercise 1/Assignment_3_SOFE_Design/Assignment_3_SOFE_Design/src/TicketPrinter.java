import java.io.*;
public class TicketPrinter {
    public void displayText(String text){
        try
        {
            FileWriter fw = new FileWriter("Ticket.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text + "\n");
            bw.close();
            System.out.println("Your ticket was printed");

        }catch(IOException e){
            System.out.println("Sorry there was an error printing your ticket");
        }

    }
}
