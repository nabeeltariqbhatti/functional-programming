import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    static class Person{
        private final  String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

      enum Gender{
        MALE,FEMALE
    }

    public static void main(String args[]){


        List<Person> people = List.of(

                new Person("Rashid", Gender.MALE),
                new Person("Fatima ", Gender.FEMALE),
                new Person("Khurshed", Gender.MALE),
                new Person("Alex", Gender.MALE),
                new Person("Aisha", Gender.FEMALE)

        );

        List<Person> females = new ArrayList<>();

        int count = 0;

        for(Person person:people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);

            }
        }
        System.out.println(females);

      //declarative approach

        Predicate<Person> getPersonPredicate = person -> person.getGender() == Gender.FEMALE;

        List<Person> females_functional = people.stream().
                filter(getPersonPredicate).
                collect(Collectors.toList());


        System.out.println(females_functional);
    }




}
