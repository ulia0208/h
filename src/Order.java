import java.util.ArrayList;
import java.util.List;

public class Order extends Automat{

    private ArrayList<Product> list;



    private Human men;

    private Integer CommonPrice;

    public Order(ArrayList<Product> list, Human men, Integer commonPrice) {
        this.list = list;
        this.men = men;
        CommonPrice = commonPrice;
    }

    public Integer getCommonPrice(){
        return CommonPrice;
    }

    @Override
    public String toString() {
        return "Order - " +
                " list=" + list +
                ", men=" + men +
                ", CommonPrice=" + CommonPrice +
                '}';
    }
}
