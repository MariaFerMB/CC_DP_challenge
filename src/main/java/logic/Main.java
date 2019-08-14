package logic;

import item.Item;
import people.Employee;
import people.Client;
import com.github.javafaker.Faker;
import people.PeopleFactory;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static Faker faker = new Faker();
    static PeopleFactory peopleFactory= new PeopleFactory();
    public static void main(String args[]){

        Queue<Employee> employees =new LinkedList<>();

        List<Products> productsList = new ArrayList<>();
        Queue<Item> vanillaCookie_items = new LinkedList<Item>();
        Queue<Item> chocolateCookie_items = new LinkedList<Item>();
        Queue<Item> lactoseFreeMilk_items = new LinkedList<Item>();
        Queue<Item> NormalMilk_items = new LinkedList<Item>();

        for(int i=0;i<5;i++){
            employees.add((Employee) peopleFactory.create("Employee",0, 0));
        }


        Products vanillaCookie = new Cookie("vanilla cookie", "1.5", "24", vanillaCookie_items);
        vanillaCookie.addItems(generateItemsList(24));

        Products ChocolateCookie = new Cookie("chocolate cookie", "2.0", "17", chocolateCookie_items);
        ChocolateCookie.addItems(generateItemsList(17));

        Products VanillaMilk = new Milk("vanilla milk", "3.6", "22", lactoseFreeMilk_items);
        VanillaMilk.addItems(generateItemsList(22));

        Products chocolateMilk = new Milk("chocolate milk", "3.1", "54", NormalMilk_items);
        chocolateMilk.addItems(generateItemsList(54));

        productsList.add(vanillaCookie);
        productsList.add(ChocolateCookie);
        productsList.add(VanillaMilk);
        productsList.add(chocolateMilk);
//        logic.Store store = new logic.Store(employeesNames,employeesIds,employeesAddresses,employeesphones,"tiendita", productsList);
//
//        store.openStore();
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

//
//        store.sell(vanillaCookie,clients.get(0));
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
//
//        store.closeStore();

    }



    public static List<Item> generateItemsList(int size){
        List<Item> items = new LinkedList<Item>();
        for (int i=0;i<size;i++){
            Item item = new Item(faker.number().numberBetween(0,1000000));
        while (isItemInList(item, items)){
                item = new Item(faker.number().numberBetween(0,1000000)); }
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

}
