package fpwithranga;

import java.util.List;
import java.util.function.Predicate;

public class FP01Functional {

    public static  Predicate<Integer> number = number-> number%2==0;
    public static void main(String[] args) {
        printAllNumbersFunctional(List.of(12,34,56,34,24,23,98));
    }

    private static void printAllNumbersFunctional(List<Integer> integers) {

        integers.stream().filter(num -> number.test(num)).forEach(System.out::println);
    }


}
