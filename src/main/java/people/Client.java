

package people;
import item.Item;

import java.util.LinkedList;
import java.util.Queue;

public class Client extends Person{

    public double budget;
    public int age;
    public Queue<Item> itemsPurchased;

    public Client( double budget, int age) {
//        this.name = name;
//        this.id = id;
//        this.address = address;
//        this.phone = phone;
        this.budget = budget;
        this.age = age;
        this.itemsPurchased = new LinkedList<>();
    }

    public void buy(){
    }
    public void printShopping(){
        System.out.println("-----------------------------------");
        System.out.println("Name:   "+name);
        System.out.println("Address:  "+address);
        System.out.println("Phone:   "+phone);
        System.out.println("Items:");

        for(Item item: itemsPurchased){
            item.printItem();
            }
        System.out.println("-----------------------------------");

    }
}
