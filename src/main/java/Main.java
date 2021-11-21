import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
    // Returns the power set of an input set as custom collection
    public class PowerSet {
        public static final <E> Collection<Set<E>> of(Set<E> s) {
            List<E> src = new ArrayList<>(s);
            if (src.size() > 30)
                throw new IllegalArgumentException("Set too big " + s);
            return new AbstractList<Set<E>>() {
                @Override public int size() {
                    return 1 << src.size(); // 2 to the power srcSize
                }
                @Override public boolean contains(Object o) {
                    return o instanceof Set && src.containsAll((Set)o);
                }
                @Override public Set<E> get(int index) {
                    Set<E> result = new HashSet<>();
                    for (int i = 0; index != 0; i++, index >>= 1)
                        if ((index & 1) == 1)
                            result.add(src.get(i));
                    return result;
                }
            };
        }
    }
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
        streamOf(List.of(12,3455,64,3,6)).forEach(System.out::println);





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
