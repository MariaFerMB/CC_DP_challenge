package item;

public class Item {
    private int id;
    private String name;
    private double price;

    public Item(int id, String name,double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void printItem(){
        System.out.println(id+"  "+name+"  "+price);
    }




}
