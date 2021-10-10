import java.util.ArrayList;

public class CashRegister {
    private int UPCcode;
    private Display display;
    private TicketPrinter printer;
    private int total = 0;
    public CashRegister(){
        this.display = new Display();
        this.printer = new TicketPrinter();
    }
    public void setCurrentProductUPC(int UPCCode){
       this.UPCcode = UPCCode;
    }
    public Product getCurrentProductInfo(){
        ProductDB db = new ProductDB();
        Product product = db.GetProductInfo(this.UPCcode);
//        String text = "Product Name: " + product.getName() + " Product Price: " + Double.toString(product.getPrice());
//        display.displayText(text);
//        printer.displayText(text);
        display.displayProduct(product);
        printer.displayProduct(product);
        return  product;
    }
}
