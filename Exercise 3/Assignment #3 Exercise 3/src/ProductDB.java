import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProductDB {
    public ProductDB(){

    }
    public Product GetProductInfo(int UPCCode){
        //goes to the database to retrive product info
        String name = "Not found";
        double price = 0;
        int Code = 0;
        try
        {
            FileReader fr= new FileReader("ProductDB.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;
            do{
                line = br.readLine();

                if(line!=null)
                {
                    String info[] = line.split(",");
                    if(info[0].equals(Integer.toString(UPCCode)))
                        {
                            Code = Integer.parseInt(info[0]);
                            name = info[1];
                            price = Double.parseDouble(info[2]);
                            break;
                        }
                }
            }while(line!=null);
        }catch(IOException e){
            System.out.println("Sorry there was an error reading your file");
        }
        Product product = new Product(name, price, Code);
        return product;
    }
}
