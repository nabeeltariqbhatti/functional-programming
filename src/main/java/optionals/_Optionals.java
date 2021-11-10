package optionals;

import java.util.Optional;
import java.util.function.Consumer;

public class _Optionals {

    public static void main(String[] args) {



     Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse( System.out::println,
                        ()-> System.out.println("Cannot send an email"));


    }
}
