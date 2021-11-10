package streams;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {



    public static void main(String[] args) {


        List<Person> people = List.of(

                new Person("Rashid", Gender.MALE),
                new Person("Angelina ",Gender.FEMALE),
                new Person("Khursheed", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Aisha", Gender.FEMALE)

        );

        //stream use case with filter

//        Set<Gender> genders = people.stream().map(person -> person.getGender()).collect(Collectors.toSet());
//        System.out.println(genders);

//        people.stream().map(person -> person.getName()).collect(Collectors.toSet()).forEach(System.out::println);
//





      //  people.stream().map(person -> person.getName()).mapToInt(len -> len.length()).forEach(System.out::println);
//   Predicate<Person> checkGender = person -> person.getGender() == (Gender.FEMALE);
// List<Person> females = people.stream().filter(person -> checkGender.test(person)).collect(Collectors.toList());
//
//
//        System.out.println(females);


//
//       boolean containseOnlyFemales =  people.stream()
//                .anyMatch(person -> person.getGender().equals(Gender.FEMALE));
//
//
//        System.out.println(containseOnlyFemales);



    }





}
