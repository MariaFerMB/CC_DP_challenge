

package people;
import item.Item;

import java.util.LinkedList;
import java.util.Queue;

public class Client extends Person {

    private double budget;
    private int age;
    private Queue<Item> itemsPurchased;

    public static class ClienteBuilder {
        private String name;
        private String id ;
        private String address ;
        private String phone ;
        private double budget;
        private int age;
        private Queue<Item> itemsPurchased;

        public ClienteBuilder() {
//            this.name =  Main.faker.harryPotter().character();
//            this .id =  Main.faker.number().digits(9);
//            this.address =Main.faker.address().fullAddress();
//            this.phone =Main.faker.phoneNumber().cellPhone();
            this.itemsPurchased = new LinkedList<>();

        }
        public ClienteBuilder withBuget(double budget) {
            this.budget = budget;
            return this;
        }
        public ClienteBuilder withAge(int age) {
            this.age= age;
            return this;
        }

        public Client build(){
            Client client = new Client();
            client.budget =this.budget;
            client.age =this.age;
            client.itemsPurchased =this.itemsPurchased;
            return client;
        }
    }


    public double getBudget() {
        return budget;
    }

    public int getAge() {
        return age;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Queue<Item> getItemsPurchased() {
        return itemsPurchased;
    }

    public void printShopping(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Name:   "+name);
        System.out.println("Address:  "+address);
        System.out.println("Phone:   "+phone);
        System.out.println("Items:");
        if (itemsPurchased.isEmpty()){
            System.out.println("Nothing");
        }
        else{
            for(Item item: itemsPurchased){
                item.printItem();
            }
        }
         System.out.println("-------------------------------------------------------------------------");

    }
}
