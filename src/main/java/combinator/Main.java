package combinator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(

                "Alice",
                "alice@email.com",
               LocalDate.of(2000,12,10),
                "03076367006"



        );
        if(new CustomerValidator().isValid(customer)){
            System.out.println("This customer with name " + customer.getName() + " is  valid");
        }


    }
}
