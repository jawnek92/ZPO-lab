package zad1;

public class Person {
    private String name;
    private String lastName;
    private String country;
    private int earnings;

    public Person(String name, String lastName, String country, int earnings) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
        this.earnings = earnings;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public int getEarnings() {
        return earnings;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", earnings=" + earnings +
                '}';
    }
}

