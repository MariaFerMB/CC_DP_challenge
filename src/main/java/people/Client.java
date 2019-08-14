

package people;
import item.Item;

import java.util.List;
import java.util.ArrayList;

public class Client extends Person{

    public double budget;
    public int age;
    public List<Item> itemsPurchased;

    public Client( double budget, int age) {
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
