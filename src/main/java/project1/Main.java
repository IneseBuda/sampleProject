package project1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
Person person1 = new Person("Inese,", "inese@inbox.lv", 243678);

        person1.sayHello();
        person1.introduce();
Customer customer1 = new Customer("Ilze,", "ilze@inbox", 289076,2000.8, LocalDate.now());

        customer1.sayHello();
        customer1.introduce();



    }

}
