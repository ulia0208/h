import java.util.ArrayList;
import java.util.List;

public interface ActorBehavoir {
    void setTookOrder(boolean t);
    void setMadeOrder(boolean m);

    boolean getTookOrder();
    boolean getMadeOrder();

    ArrayList<Product> MadeOrder(List<String> myList);


}
