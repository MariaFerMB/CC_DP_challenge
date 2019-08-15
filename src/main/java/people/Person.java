package people;

import logic.Main;

public  class Person {

    String name = Main.faker.harryPotter().character();
    String id = Main.faker.number().digits(9);
    String address = Main.faker.address().fullAddress();
    String phone = Main.faker.phoneNumber().cellPhone();

}
