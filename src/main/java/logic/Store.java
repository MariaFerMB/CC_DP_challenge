package logic;

import item.Product;
import people.Client;
import people.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Store {
    public Queue<Employee> employees;
    public  List<Product> productsList;
    public String nombre;

    public Store(Queue<Employee> employees, String nombre, List<Product> productsList) {
        this.employees = employees;
        this.nombre = nombre;
        this.productsList = productsList;
    }

    public void openStore(){
        System.out.println("Store is open");
    }

    public void sell(Product product, Client client){
        double price = 0;
        for (int i=0; i<productsList.size(); i++){
            if(product.equals(productsList.get(i))){
                price = productsList.get(i).getPrice();
                client.budget = client.budget - price;
                client.itemsPurchased.add(productsList.get(i).removeItem());
            }
        }
        if (price==0){
            System.out.println("That product isn't exists on this store");
        }
    }

    public void closeStore(){
        System.out.println("Closing store");
    }

}

