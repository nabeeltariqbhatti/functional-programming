package predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {


        System.out.println(isPhoneNumberValid("03074567223"));
        System.out.println("if phone number is valid and contains 3 "+ isPhoneNumberValidFunctional.or(doesPhoneNumberContains).test("03074567223"));

        System.out.println("if phone number is valid or contains 3 "+ isPhoneNumberValidFunctional.or(doesPhoneNumberContains).test("030745672"));


        if(biPredicate.test(isPhoneNumberValidFunctional, doesPhoneNumberContains)){
            System.out.println("bi predicate with string is tested");
        }
    }


    static Predicate<String> isPhoneNumberValidFunctional = phoneNumber -> phoneNumber.startsWith("03") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber){
     return phoneNumber.startsWith("03") && phoneNumber.length() == 11;

    }
    static Predicate<String> doesPhoneNumberContains = phoneNumber -> phoneNumber.contains("3");


    static BiPredicate<Predicate,Predicate> biPredicate = (length, containMentChecker) -> length.test("03456754323") && containMentChecker.test("03456754323");



}
