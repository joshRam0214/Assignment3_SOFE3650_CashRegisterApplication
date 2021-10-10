public class Display implements View {

    public void displayText(String text){
        System.out.println(text);
    }

    @Override
    public void displayProduct(Product product) {
        String text = "Product Name: " + product.getName() + " Product Price: " + Double.toString(product.getPrice());
        this.displayText(text);
    }
}
