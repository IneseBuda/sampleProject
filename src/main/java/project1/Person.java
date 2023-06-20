package project1;

public class Person {
    private String name;
    private String email;
    private long phone;

    public Person(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public void sayHello() {
        System.out.println("Hello person");


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

    public void introduce() {
        System.out.println(" Person name: " + name + " Person phone number: " + phone);
    }
}