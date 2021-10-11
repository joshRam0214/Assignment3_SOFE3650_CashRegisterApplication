import java.util.ArrayList;

public class CashRegister extends Subject {
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
       this.getCurrentProductInfo();
    }

    @Override
    void notifyObserver(Product product) {

        String text = "Product Name: " + product.getName() + " Product Price: " + Double.toString(product.getPrice());
        display.update(text);
        printer.update(text);
    }

    public Product getCurrentProductInfo(){
        ProductDB db = new ProductDB();
        Product product = db.GetProductInfo(this.UPCcode);
        this.notifyObserver(product);

        return product;

    }

}
