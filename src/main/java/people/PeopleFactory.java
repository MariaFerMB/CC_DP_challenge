package people;

import java.math.BigInteger;

public class PeopleFactory {

    public Employee  createEmpleoyee(){

        return new Employee();
    }

    public Client createClient(double budget, BigInteger age){

        return new Client(budget, age);
    }

}
