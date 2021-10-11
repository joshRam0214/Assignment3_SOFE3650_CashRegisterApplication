public abstract class Subject {

    abstract void  setCurrentProductUPC(int UPCCode);
    abstract void  notifyObserver(Product product);
    abstract Product getCurrentProductInfo();
}
