package logic;

import item.Product;
import people.Employee;
import java.util.List;
import java.util.Queue;

public class Store {
    public Queue<Employee> employees;
    public  List<Product> productsList;
    public String name;

    public Store(Queue<Employee> employees, String name, List<Product> productsList) {
        this.employees = employees;
        this.name = name;
        this.productsList = productsList;
    }

    public void openStore(){
        System.out.println(name+" store is open");
    }

    public void closeStore(){
        System.out.println("Closing store");
    }

}

