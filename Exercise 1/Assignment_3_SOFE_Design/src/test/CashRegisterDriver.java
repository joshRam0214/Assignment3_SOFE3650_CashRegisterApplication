public class CashRegisterDriver {
    public static void main(String[]args){
        Scanner scanner = new Scanner();
        Keyboard keyboard = new Keyboard();
        CashRegister cashRegister = new CashRegister();

        //this is where my scanner is working
        scanner.ScannedUPCCode(10000001);

        //use my cash register
        cashRegister.setCurrentProductUPC(scanner.GetScannedUPCCode());
        cashRegister.getCurrentProductInfo();

        //this is with my keyboard
        keyboard.setUPCCode(10000010);

        //use my cash register
        cashRegister.setCurrentProductUPC(keyboard.GetUPCCode());
        cashRegister.getCurrentProductInfo();
    }
}
