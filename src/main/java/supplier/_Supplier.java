package supplier;

import java.util.EnumSet;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getConnectionUrl());

        System.out.println(getConnectionUrlFunctional.get());


    }

    static String getConnectionUrl(){
        return "jdbc://localhost:3306/users";
    }

    static  Supplier<String> getConnectionUrlFunctional =()-> "jdbc://localhost:3306/users";
}
