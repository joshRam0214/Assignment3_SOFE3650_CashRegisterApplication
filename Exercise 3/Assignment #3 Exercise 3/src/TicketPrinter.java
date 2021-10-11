import java.io.*;
public class TicketPrinter extends Observer {
     void displayText(String text){
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

    @Override
    void update(String text) {
        this.displayText(text);
    }
}
