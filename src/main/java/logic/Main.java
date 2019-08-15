package logic;

import item.Cereal;
import item.CerealFactory;
import item.CookiesFactory;
import item.MilkFactory;
import item.Product;
import people.Employee;
import people.Client;
import com.github.javafaker.Faker;
import people.PeopleFactory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static Faker faker = new Faker();
    static PeopleFactory peopleFactory= new PeopleFactory();
    static CookiesFactory cookiesFactory= new CookiesFactory();
    static MilkFactory milkFactory= new MilkFactory();
    static CerealFactory cerealFactory= new CerealFactory();
    public static void main(String args[]){

        Queue<Employee> employees =new LinkedList<>();

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
            employees.add((Employee) peopleFactory.create("Employee",0, 0));
        }

        List<Client> clients = new ArrayList<>();
        clients.add((Client) peopleFactory.create( "Client",13.5, 23));
        clients.add((Client) peopleFactory.create( "Client",10.8, 31));
        clients.add((Client) peopleFactory.create( "Client",9.1, 19));
        clients.add((Client) peopleFactory.create( "Client",27.8, 25));
        clients.add((Client) peopleFactory.create( "Client",5.0, 37));
        clients.add((Client) peopleFactory.create( "Client",14.6,47));
        clients.add((Client) peopleFactory.create( "Client",11.2, 81));
        clients.add((Client) peopleFactory.create( "Client",10.1, 42));
        clients.add((Client) peopleFactory.create( "Client",13.0, 19));
        clients.add((Client) peopleFactory.create("Client", 43.2, 33));

        store.openStore();
        store.employees.peek().sell(store.productsList,vanillaCookie,clients.get(0));
        store.employees.peek().sell(store.productsList,vanillaMilk,clients.get(3));
        store.employees.peek().sell(store.productsList,strawberryCereal,clients.get(3));
        store.employees.peek().sell(store.productsList,chocolateCookie,clients.get(7));
//        store.sell(vanillaCookie,clients.get(0));
//        store.sell(vanillaCookie,clients.get(4));
//        store.sell(ChocolateCookie,clients.get(4));
//        store.sell(vanillaCookie,clients.get(7));
//        store.sell(vanillaCookie,clients.get(7));
//        store.sell(vanillaCookie,clients.get(7));
//        store.sell(vanillaCookie,clients.get(3));
//        store.sell(chocolateMilk,clients.get(9));
//        store.sell(ChocolateCookie,clients.get(9));
//        store.sell(ChocolateCookie,clients.get(9));
//        store.sell(ChocolateCookie,clients.get(1));


        store.closeStore();
        for(Client client: clients){
            client.printShopping();
        }

    }
}
