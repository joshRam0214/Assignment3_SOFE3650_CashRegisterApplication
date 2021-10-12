import java.util.ArrayList;

public class CashRegister extends Subject {
    private int UPCcode;
    ArrayList<Observer> observers;

    private int total = 0;
    public CashRegister(){
        this.observers = new ArrayList<Observer>();
    }
    public void setCurrentProductUPC(int UPCCode){
       this.UPCcode = UPCCode;
    }

    @Override
    void notifyObserver(Product product) {

        String text = "Product Name: " + product.getName() + " Product Price: " + Double.toString(product.getPrice());
        for(Observer o: observers){
            o.update(text);
        }
    }

    public Product getCurrentProductInfo(){
        ProductDB db = new ProductDB();
        Product product = db.GetProductInfo(this.UPCcode);
        this.notifyObserver(product);

        return product;

    }

    @Override
    void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    void removeObserver(Observer o) {
        try {
            observers.remove(observers.indexOf(o));
            System.out.println("Removed Observer "+o);
        }
        catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("No such Observer called "+o);
        }
    }

}
