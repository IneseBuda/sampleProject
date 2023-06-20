package project1;

import java.time.LocalDate;

public class Customer extends Person{

    private double balance;
    private LocalDate date;

    public Customer(String name, String email, long phone, double balance, LocalDate date) {
        super(name, email, phone);
        this.balance = balance;
        this.date = date;
    }

    public Customer(String name, String email, long phone) {
        super(name, email, phone);

    }

    @Override
    public void sayHello() {
        System.out.println("Hello customer");

    }

    @Override
    public void introduce() {
        System.out.println(" Name of customer: " + getName() + " Customer phone number: " + getPhone());
    }
}
