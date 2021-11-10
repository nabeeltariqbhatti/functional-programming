package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer,ValidationResult> {

    static  CustomerRegistrationValidator isEmailValid() {
        return customer ->{

            System.out.println("running email validation");
            return  customer.getEmail().contains("@") ? ValidationResult.SUCCESS :ValidationResult.EMAIL_IS_NOT_VALID;
        };


    }

    static  CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? ValidationResult.SUCCESS :ValidationResult.IS_NOT_AN_ADULT;
    }


    static  CustomerRegistrationValidator isNumberValid() {
        return customer -> customer.getNumber().length() == 11 ? ValidationResult.SUCCESS :ValidationResult.PHONE_NUMBER_IS_NOT_VALID;

    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
      return   customer -> { ValidationResult validationResult = this.apply(customer);
       return validationResult.equals(ValidationResult.SUCCESS) ? other.apply(customer) : validationResult;

      };
    }



}
