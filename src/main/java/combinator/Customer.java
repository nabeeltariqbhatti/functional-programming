package combinator;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {

    private final String name;
    private final String email;
    private final LocalDate dob;
    private final String number;


    public Customer(String name, String email, LocalDate dob, String number) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getName(), customer.getName()) && Objects.equals(getEmail(), customer.getEmail()) && Objects.equals(getDob(), customer.getDob());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getDob());
    }

    public String getNumber() {
        return number;
    }
}
