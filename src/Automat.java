import java.util.ArrayList;
import java.util.List;




public class Automat {
    List<Product> productList=new ArrayList<>();

    public Automat() {
        this.productList = productList;
    }

    public void initProduct(List <Product> myList){
        productList=myList;
    }


    public Product getProduct(String name) {
        ArrayList<Product> tempProduct=new ArrayList<>();
        for(Product element:productList){
            if(element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }

    public Integer CommonPrice=0;
    ArrayList<Product>orderProduct;

    Integer price;


    public ArrayList<Product> createOrder(ArrayList<Product> orderProduct){

        for(Product product:productList){
            if(product.getQuantity()>0){
                orderProduct.add(product);
            }
        }
        return orderProduct;
    };

    public Integer commonPrice(Integer price){
        this.price=price;
        for(Product product:orderProduct){
            CommonPrice =+ product.getPrice();
        }
        return CommonPrice;
    }

}
