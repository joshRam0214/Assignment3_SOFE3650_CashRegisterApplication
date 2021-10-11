public class Product {
    private String Name;
    private double price;
    private int UPCode;
    public Product(String Name, double price, int UPCode){
        this.Name = Name;
        this. price = price;
        this. UPCode = UPCode;
    }
    public String getName(){
        return Name;
    }
    public double getPrice(){
        return price;
    }

}
