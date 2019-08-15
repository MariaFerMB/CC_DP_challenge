package people;

import item.Product;

import java.util.List;

public class Employee extends Person {

    public Employee(){    }

    public void sell(List<Product> productsList,Product product, Client client){
        double price = 0;
        for (int i=0; i<productsList.size(); i++){
            if(product.equals(productsList.get(i))){
                price = productsList.get(i).getPrice();
                if(client.getBudget() - price>=0){
                    client.setBudget(client.getBudget() - price) ;
                    client.getItemsPurchased().add(productsList.get(i).removeItem());
                }
                else {
                    System.out.println(client.name+ "  don't have enough money to buy "+ product.name );
                }
            }
        }
        if (price == 0){
            System.out.println("That product isn't exists on this store");
        }
    }
}
