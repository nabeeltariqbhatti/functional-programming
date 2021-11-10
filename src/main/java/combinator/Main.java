package combinator;

import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static combinator.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(

                "Alice",
                "alice@email.com",
               LocalDate.of(2000,12,10),
                "03076367006"



        );

       ValidationResult result =  isEmailValid()
                .and(isAdult())
                .and(isNumberValid()).apply(customer);
        if(result == ValidationResult.SUCCESS) {
            System.out.println(customer);
        }else {
          throw  new IllegalStateException(result.name());
        }


    }
}
