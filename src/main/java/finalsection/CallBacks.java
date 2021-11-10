package finalsection;

import java.util.function.Consumer;

public class CallBacks {

    public static void main(String[] args) {

        hello("", "Bhatti" , value-> System.out.println(value));
        hello2("", "husnain", () -> System.out.println("runnable dealing with callback"));

    }


    static void hello(String first, String last, Consumer<String > callBack){
        if(first.isEmpty() || last.isEmpty()){
            callBack.accept("Call back function is called");
        }else{
            System.out.println(first + " " + last);
        }
    }

    static void hello2(String first, String last, Runnable callBack){
        if(first.isEmpty() || last.isEmpty()){
            callBack.run();
        }else{
            System.out.println(first + " " + last);
        }
    }
}
