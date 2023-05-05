package come.cydeo.test.shorts;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class P25_JavaFakerPractice {

    @Test
    public void javaFakerTest(){

        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.name().lastName() = " + faker.address().fullAddress());
        System.out.println("faker.phoneNumber() = " + faker.phoneNumber().phoneNumber());
        System.out.println("(faker.company().name()) = " + (faker.company().name()));
        System.out.println("faker.country().flag() = " + faker.country().flag());

    }
}
