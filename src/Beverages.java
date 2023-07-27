import java.util.Calendar;

public class Beverages extends Product{

    protected double volume;


    public Beverages(String name, Integer price, Integer quantity, Calendar bestBefore, double volume) {
        super(name, price, quantity, bestBefore);
        this.volume=volume;

    }

    public double getVolume(){
        return getVolume();

    }

    @Override
    public String toString() {
        return "Beverages{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", bestBefore=" + bestBefore.get(Calendar.DATE)+"."+bestBefore.get(Calendar.MONTH)+"."+bestBefore.get(Calendar.YEAR)+
                '}';
    }
}
