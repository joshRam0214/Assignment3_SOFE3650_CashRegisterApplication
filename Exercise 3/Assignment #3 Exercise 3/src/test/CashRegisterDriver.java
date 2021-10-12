public class CashRegisterDriver {
    public static void main(String[]args){
        Scanner scanner = new Scanner();
        Keyboard keyboard = new Keyboard();

        //creating observers
        Observer display = new Display();
        Observer ticketPrinter = new TicketPrinter();

        //creating subject
        Subject cashRegister = new CashRegister();

        //registering obsevers
        cashRegister.registerObserver(display);
        cashRegister.registerObserver(ticketPrinter);

        //this is where my scanner is working
        scanner.ScannedUPCCode(10000010);

        //use my cash register
        cashRegister.setCurrentProductUPC(scanner.GetScannedUPCCode());
        cashRegister.getCurrentProductInfo();


        //this is with my keyboard
        keyboard.setUPCCode(10000001);

        //use my cash register
        cashRegister.setCurrentProductUPC(keyboard.GetUPCCode());
        cashRegister.getCurrentProductInfo();

    }
}
