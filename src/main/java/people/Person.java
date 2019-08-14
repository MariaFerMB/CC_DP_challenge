package people;

import com.github.javafaker.Faker;
import logic.Main;

public abstract class Person {

    String name = Main.faker.harryPotter().character();
    String id = Main.faker.address().fullAddress();
    String address = Main.faker.phoneNumber().cellPhone();
    String phone = Main.faker.number().digits(9);
}
