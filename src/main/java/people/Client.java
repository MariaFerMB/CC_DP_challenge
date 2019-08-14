

package people;
import item.Item;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

public class Client extends Person{

    public double budget;
    public BigInteger age;
    public List<Item> itemsPurchased;

    public Client( double budget, BigInteger age) {
//        this.name = name;
//        this.id = id;
//        this.address = address;
//        this.phone = phone;
        this.budget = budget;
        this.age = age;
        this.itemsPurchased = new ArrayList<>();
    }

    public void buy(){
    }
}
