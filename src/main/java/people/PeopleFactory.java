package people;

import java.math.BigInteger;

public class PeopleFactory {


    public Person create (String type, double budget, int age){
        Person person = null;

        if (type.equals( "Employee")){
            person=  new Employee();
        }

        else if (type.equals( "Cliente")){
            person=  new Client(budget,age);
        }

        return person;

    }

}
