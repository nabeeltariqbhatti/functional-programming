package fpwithranga;

import java.util.ArrayList;
import java.util.List;

public class FP02Functional {


    public static void main(String[] args) {
        List<String> courses = new ArrayList<>(List.of("Java", "Spring 5", "Spring boot", "Microservices"));



        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);


    }


}
