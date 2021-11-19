package effectivejava;

import java.util.*;
import java.util.function.Function;
import java.util.function.LongToIntFunction;

public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
        elements =(E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public void pushAll(Iterable<? extends E> src){
        for(E s : src){
            push(s);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }
}
 enum Apple { FUJI, PIPPIN, GRANNY_SMITH }
 enum Orange { NAVEL, TEMPLE, BLOOD }

 enum Planet {
    MERCURY(3.302e+23, 2.439e6),
    VENUS (4.869e+24, 6.052e6),
    EARTH (5.975e+24, 6.378e6),
    MARS (6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN (5.685e+26, 6.027e7),
    URANUS (8.683e+25, 2.556e7),
    NEPTUNE(1.024e+26, 2.477e7);
    private final double mass; // In kilograms
    private final double radius; // In meters
    private final double surfaceGravity; // In m / s^2

     // Universal gravitational constant in m^3 / kg s^2
     private static final double G = 6.67300E-11;
     // Constructor
     Planet(double mass, double radius) {
         this.mass = mass;
         this.radius = radius;
         surfaceGravity = G * mass / (radius * radius);
     }
     public double mass() { return mass; }
     public double radius() { return radius; }
     public double surfaceGravity() { return surfaceGravity; }
     public double surfaceWeight(double mass) {
         return mass * surfaceGravity; // F = ma
     }

     @Override
     public String toString() {
         return "Planet{" +
                 "mass=" + mass +
                 ", radius=" + radius +
                 ", surfaceGravity=" + surfaceGravity +
                 '}';
     }
 }

// Enum type with constant-specific class bodies & data (Item 34)
 enum Operation {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };
    private final String symbol;
    Operation(String symbol) { this.symbol = symbol; }
    @Override public String toString() { return symbol; }
    public abstract double apply(double x, double y);
}

// Abuse of ordinal to derive an associated value - DON'T DO THIS
enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),
    NONET(9), DECTET(10), TRIPLE_QUARTET(12);
    private final int numberOfMusicians;
    Ensemble(int size) { this.numberOfMusicians = size; }
    public int numberOfMusicians() { return numberOfMusicians; }
}


@FunctionalInterface
interface func{
    void checker(int a, int b);
}
class StackTestDrive{


    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }
    public static void main(String args[]) {

        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{1,23,45,6});

        System.out.println(stack.pop());

        List guys = List.of("Tom", "Dick", "Harry","harry","tom","Tom");
        Set stooges = Set.of("Larry", "Moe", "Curly",2);
//        Set aflCio = union(guys, stooges);
//        System.out.println(aflCio);


       func f = (a,b) ->System.out.println(a+b);
        Function<Integer,String> function = t-> t==0 ? "it was okay" :"get the fucking straight with matters k=like these";

        System.out.println(function.apply(0));

       f.checker(23,45);


//       Collections.sort(Arrays.asList(guys.toArray()), comparingInt(String::length));

        guys.stream().sorted(Comparator.comparingInt(String::length)).distinct().forEach(System.out::println);



        System.out.println(guys);

//        System.out.println(Operation.MINUS.apply(23,45));





//        for (String arg : args)
//            stack.push(arg);
//        while (!stack.isEmpty())
//            System.out.println(stack.pop().toUpperCase());




    }

}