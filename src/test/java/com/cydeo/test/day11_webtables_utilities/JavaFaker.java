package com.cydeo.test.day11_webtables_utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {
    @Test
    public void fakerTest() {


        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());
        faker.address().state();
        System.out.println("faker.number().numberBetween(1000,9000) = " + faker.number().numberBetween(1000, 9000));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("703-###-####"));
        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.chuckNorris().fact().replaceAll(\"chuckNorris\", \"Saim\") = " + faker.chuckNorris().fact().replaceAll("chuckNorris", "Saim"));
    }
//    String name = faker.name().fullName();
//    String firstName=faker.name().firstname();
//    String lastName = faker.name().lastName();
//
//    String streetAddress = faker.address().streetAddress();
//}
}