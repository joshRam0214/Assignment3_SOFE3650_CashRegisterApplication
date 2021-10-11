public class Display extends Observer {
    public void displayText(String text){
        System.out.println(text);
    }

    @Override
    void update(String text) {
        this.displayText(text);
    }
}
