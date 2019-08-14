package logic;

import item.Item;
import logic.Products;

import java.util.Queue;


public class Cookie extends Products {

    public Cookie(String name, String price, String quantity, Queue<Item> items){
        super(name,price,quantity,items);
    }
}
