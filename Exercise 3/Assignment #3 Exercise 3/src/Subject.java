public abstract class Subject {

    abstract void  setCurrentProductUPC(int UPCCode);
    abstract void  notifyObserver(Product product);
    abstract Product getCurrentProductInfo();
    abstract void registerObserver(Observer o);
    abstract void removeObserver(Observer o);
}
