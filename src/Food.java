import java.util.Calendar;

public class Food extends Product{

    private double weight;

    public Food(String name, Integer price, Integer quantity, Calendar bestBefore, double weight) {
       super(name, price, quantity, bestBefore);
       this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", bestBefore=" + bestBefore.get(Calendar.DATE)+"."+bestBefore.get(Calendar.MONTH)+"."+bestBefore.get(Calendar.YEAR)+
                '}';
    }
}
