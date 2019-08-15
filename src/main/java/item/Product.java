package item;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import logic.Main;

public class Product {

    public String name;
    public double price;
    public int quantity;
    public Queue<Item> items;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.items =new LinkedList<>();
        addItems(generateItemsQueue());
    }

    public double getPrice(){
        return price;
    }

    public Item removeItem (){
        quantity = quantity-1;
        return items.poll();
    }

    public void addItems(List<Item> items_to_add){
        this.items.addAll(items_to_add);
    }



    private  LinkedList<Item> generateItemsQueue(){
        LinkedList<Item> items = new LinkedList<>();
        for (int i=0;i<quantity;i++){
            Item item = new Item(Main.faker.number().numberBetween(0,1000000));
            while (isItemInList(item, items)){
                item = new Item(Main.faker.number().numberBetween(0,1000000)); }
            items.add(item);
        }
        return items;
    }

    public static boolean isItemInList(Item expectedItem, List<Item> lista){
        for(Item item: lista){
            if (expectedItem.id==item.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("\n Name: %s\n Price: %s \n Quantity: %s", this.name, this.price, this.quantity);
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        return (this.toString().equalsIgnoreCase(other.toString()));
    }







}
