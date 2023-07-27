import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class Human extends Actor{

    private double money;
    private Automat nearestAutomat;

    public Human(String name1, boolean MadeOrder1, boolean TookOrder1, double money) {
        super(name1, MadeOrder1, TookOrder1);
        this.money=money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void setTookOrder(boolean t) {

    }

    @Override
    public void setMadeOrder(boolean m) {

    }

    @Override
    public boolean getTookOrder() {
        return false;
    }

    @Override
    public boolean getMadeOrder() {
        return false;
    }

    public void FindNearestAutomat(){

        Product product1=new Food("Twix", 80, 10, new GregorianCalendar(2024,12,12), 125);
        Product product2=new Food("Mars", 75,12,new GregorianCalendar(2024,10,23),100);
        Product product3=new Beverages("Fanta", 90,8, new GregorianCalendar(2024, 01,20),0.5);
        Product product4=new Beverages("Sprite", 90,6, new GregorianCalendar(2024, 10,10),0.5);
        Product product5=new HotBeverage("Tea", 60,12, new GregorianCalendar(2023, 11,10),0.25,42);
        Product product6=new HotBeverage("Coffe", 80,15, new GregorianCalendar(2023, 12,15),0.25,45);


        ArrayList<Product> myProductList=new ArrayList<>();

        myProductList.add(product1);
        myProductList.add(product2);
        myProductList.add(product3);
        myProductList.add(product4);
        myProductList.add(product5);
        myProductList.add(product6);

        Automat automat = new Automat();

        automat.initProduct(myProductList);
        this.nearestAutomat=automat;

    }

    @Override
    public ArrayList<Product> MadeOrder(List<String> myList) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shoppingProduct;
        for (String nameProd:myList){
            shoppingProduct=nearestAutomat.getProduct(nameProd);
            if(nearestAutomat.getProduct(nameProd)!=null){
                shoppingList.add(shoppingProduct);

            }
        }

        setMadeOrder(true);
        return nearestAutomat.createOrder(shoppingList);

    }



}
