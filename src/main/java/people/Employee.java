package people;

import com.github.javafaker.Faker;
import item.Product;

import java.util.List;

public class Employee extends Person{

    public Employee(){
    }

    public void sell(List<Product> productsList,Product product, Client client){
        double price = 0;
        for (int i=0; i<productsList.size(); i++){
            if(product.equals(productsList.get(i))){
                price = productsList.get(i).getPrice();
                if(client.budget - price>=0){
                    client.budget = client.budget - price;
                    client.itemsPurchased.add(productsList.get(i).removeItem());
                }
                else {
                    System.out.println("You don't have enough money to buy this product");
                }
            }
        }
        if (price==0){
            System.out.println("That product isn't exists on this store");
        }
    }
}
