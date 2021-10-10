import java.io.*;
public class TicketPrinter implements View {
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

    @Override
    public void displayProduct(Product product) {
        String text = "Product Name: " + product.getName() + " Product Price: " + Double.toString(product.getPrice());
        this.displayText(text);
    }
}
