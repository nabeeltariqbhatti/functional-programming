package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {


    public static void main(String args[]){

        Function <Integer,Integer> incrementFunction = number -> number+1;
        Function <Integer,Integer> multiplyBy10 = number -> number * 10;
        System.out.println(increment(0));

        Function<Integer, Integer> integerIntegerFunction = incrementFunction.andThen(multiplyBy10);
        System.out.println(integerIntegerFunction.apply(20));


        BiFunction<Integer, Integer, Integer> binfunctionExample =  (number1, number2) -> number1+number2;
        System.out.println( binfunctionExample.apply(10,20));

    }




    private static int increment(int i) {

        return i+1;
    }
}
