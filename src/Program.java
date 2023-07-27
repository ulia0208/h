import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Program {
    public static void main(String[] args) {

        Product product1=new Food("Twix", 80, 10, new GregorianCalendar(2024,12,12), 125);
        Product product2=new Food("Mars", 75,12,new GregorianCalendar(2024,10,23),100);
        Product product3=new Beverages("Fanta", 90,8, new GregorianCalendar(2024, 01,20),0.5);
        Product product4=new Beverages("Sprite", 90,6, new GregorianCalendar(2024, 10,10),0.5);
        Product product5=new HotBeverage("Tea", 60,12, new GregorianCalendar(2023, 11,10),0.25,42);
        Product product6=new HotBeverage("Coffe", 80,15, new GregorianCalendar(2023, 12,15),0.25,45);


        Automat list=new Automat();
        ArrayList<Product> myProductList=new ArrayList<>();

        myProductList.add(product1);
        myProductList.add(product2);
        myProductList.add(product3);
        myProductList.add(product4);
        myProductList.add(product5);
        myProductList.add(product6);


        list.initProduct(myProductList);

//        HotBeverageAutomat hotBeverageAutomat=new HotBeverageAutomat(myProductList);
//
//        HotBeverage teaFromAutomat=hotBeverageAutomat.getProduct("Tea",60,0.25,42);
//        if(teaFromAutomat!=null){
//            System.out.println("Готово! "+teaFromAutomat);
//        }else {
//            System.out.println("Недоступно! ");
//        }

        //HotBeverage coffeFromAutomat=hotBeverageAutomat.getProduct("Coffe",80,15,45);
        String name="Tea";

        System.out.println(list.getProduct(name).toString());


    }
}

//    Реализовать метод оформления заказ createOrder(...):
//        нужно пройти по продуктам, проверить наличие (>0), "запомнить цену"
//       * Создать объек Order с полями List<Product>, который содержит только продукты из наличия,
//        и поле стоимость - сумма цен продуктов, входящих в заказ.
//       * Вернуть объект Order. В классе Order переопределить метод toString() -
//        показывать состав заказа, заказчика и общую стоимость продуктов.
