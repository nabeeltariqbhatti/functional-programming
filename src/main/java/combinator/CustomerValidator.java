package combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {

    private  boolean isEmailValid(String email){
        return email.contains(email);
    }

    private  boolean isVlaidNumber(String number){
        return number.contains("3");
    }
     private boolean isAdult(LocalDate localDate){
       // return LocalDate.now().getYear() - localDate.getYear() >=18;

   return Period.between(localDate, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail()) && isVlaidNumber(customer.getNumber()) && isAdult(customer.getDob());

    }

}
