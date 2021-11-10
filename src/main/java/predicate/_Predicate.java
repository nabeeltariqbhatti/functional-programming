package predicate;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {


        System.out.println(isPhoneNumberValid("03074567223"));
        System.out.println(isPhoneNumberValidFunctional.test("03452345243"));
    }


    static Predicate<String> isPhoneNumberValidFunctional = phoneNumber -> phoneNumber.startsWith("03") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber){
     return phoneNumber.startsWith("03") && phoneNumber.length() == 11;

    }
}
