import java.util.Calendar;

public class HotBeverage extends Beverages{
    protected double temp;
    public HotBeverage(String name, Integer price, Integer quantity, Calendar bestBefore,double volume,double temp) {
        super(name, price, quantity, bestBefore, volume);
        this.temp=temp;
    }

    public double getTemp(){
        return getTemp();

    }

    @Override
    public String toString() {
        return "HotBeverage - " +
                " temp=" + temp +
                ", volume=" + volume +
                ", name='" + name + "'" +
                ", price=" + price +
                ", quantity=" + quantity +
                ", bestBefore=" + bestBefore.get(Calendar.DATE)+"."+bestBefore.get(Calendar.MONTH)+"."+bestBefore.get(Calendar.YEAR)+
                '.';
    }
}
