package fpwithranga;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {
        printAllEvenNumbers(List.of(12,34,56,34,24,23,98));
    }

    private static void printAllEvenNumbers(List<Integer> integers) {

        for(Integer n : integers){
            if(n%2==0){
                System.out.println(n);
            }

        }
    }
}
