package logic;

import item.Product;
import people.Employee;
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



    public void closeStore(){
        System.out.println("Closing store");
    }

}

