package logic;

import item.CerealFactory;
import item.CookiesFactory;
import item.MilkFactory;
import item.Product;
import people.Client;
import people.Employee;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static Faker faker = new Faker();
    static CookiesFactory cookiesFactory = new CookiesFactory();
    static MilkFactory milkFactory = new MilkFactory();
    static CerealFactory cerealFactory = new CerealFactory();
    public static void main(String args[]){

        Queue<Employee> employees = new LinkedList<>();
        List<Product> productsList = new ArrayList<>();

        Product vanillaCookie = cookiesFactory.createVanilla();
        Product chocolateCookie = cookiesFactory.createChocolate();
        Product strawberryCookie = cookiesFactory.createStrawberry();
        Product vanillaMilk = milkFactory.createVanilla();
        Product chocolateMilk = milkFactory.createChocolate();
        Product strawberryMilk = milkFactory.createStrawberry();
        Product vanillaCereal = cerealFactory.createVanilla();
        Product chocolateCereal = cerealFactory.createChocolate();
        Product strawberryCereal = cerealFactory.createStrawberry();

        productsList.add(vanillaCookie);
        productsList.add(chocolateCookie);
        productsList.add(strawberryCookie);
        productsList.add(vanillaMilk);
        productsList.add(chocolateMilk);
        productsList.add(strawberryMilk);
        productsList.add(vanillaCereal);
        productsList.add(chocolateCereal);
        productsList.add(strawberryCereal);

        Store store = new Store(employees,"tiendita", productsList);

        for(int i=0;i<5;i++){
            employees.add(new Employee());
        }

        List<Client> clients = new ArrayList<>();
        clients.add( new Client.ClienteBuilder().withAge(23).withBuget(13.5).build());
        clients.add( new Client.ClienteBuilder().withAge(31).withBuget(10.8).build());
        clients.add( new Client.ClienteBuilder().withAge(19).withBuget(9.1).build());
        clients.add( new Client.ClienteBuilder().withAge(25).withBuget(27.8).build());
        clients.add( new Client.ClienteBuilder().withAge(37).withBuget(5.0).build());
        clients.add( new Client.ClienteBuilder().withAge(47).withBuget(14.6).build());
        clients.add( new Client.ClienteBuilder().withAge(81).withBuget(11.2).build());
        clients.add( new Client.ClienteBuilder().withAge(42).withBuget(10.1).build());
        clients.add( new Client.ClienteBuilder().withAge(19).withBuget(13.0).build());
        clients.add( new Client.ClienteBuilder().withAge(33).withBuget(10.1).build());



        store.openStore();
        store.employees.peek().sell(store.productsList,vanillaCookie,clients.get(0));
        store.employees.peek().sell(store.productsList,vanillaMilk,clients.get(3));
        store.employees.peek().sell(store.productsList,strawberryCereal,clients.get(3));
        store.employees.peek().sell(store.productsList,chocolateMilk,clients.get(7));
        store.employees.peek().sell(store.productsList,vanillaCookie,clients.get(4));
        store.employees.peek().sell(store.productsList,strawberryMilk,clients.get(1));
        store.employees.peek().sell(store.productsList,vanillaMilk,clients.get(2));
        store.employees.peek().sell(store.productsList,strawberryCereal,clients.get(5));
        store.employees.peek().sell(store.productsList,chocolateCookie,clients.get(6));
        store.employees.peek().sell(store.productsList,strawberryCookie,clients.get(8));

        store.employees.peek().sell(store.productsList,vanillaCookie,clients.get(1));
        store.employees.peek().sell(store.productsList,vanillaMilk,clients.get(4));
        store.employees.peek().sell(store.productsList,vanillaCereal,clients.get(9));
        store.employees.peek().sell(store.productsList,chocolateCookie,clients.get(7));
        store.employees.peek().sell(store.productsList,chocolateCereal,clients.get(5));
        store.employees.peek().sell(store.productsList,vanillaCookie,clients.get(1));
        store.employees.peek().sell(store.productsList,vanillaMilk,clients.get(8));
        store.employees.peek().sell(store.productsList,strawberryCereal,clients.get(8));
        store.employees.peek().sell(store.productsList,strawberryCookie,clients.get(7));
        store.employees.peek().sell(store.productsList,vanillaCereal,clients.get(5));

        store.employees.peek().sell(store.productsList,vanillaCookie,clients.get(0));
        store.employees.peek().sell(store.productsList,vanillaMilk,clients.get(3));
        store.employees.peek().sell(store.productsList,strawberryCereal,clients.get(6));
        store.employees.peek().sell(store.productsList,chocolateCookie,clients.get(7));
        store.employees.peek().sell(store.productsList,strawberryMilk,clients.get(4));
        store.employees.peek().sell(store.productsList,chocolateMilk,clients.get(0));
        store.employees.peek().sell(store.productsList,strawberryCookie,clients.get(2));
        store.employees.peek().sell(store.productsList,strawberryCereal,clients.get(6));
        store.employees.peek().sell(store.productsList,chocolateCookie,clients.get(7));
        store.employees.peek().sell(store.productsList,vanillaCookie,clients.get(5));

        store.closeStore();
        for(Client client: clients){
            client.printShopping();
        }

    }
}
