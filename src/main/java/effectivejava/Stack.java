package effectivejava;

import java.util.Arrays;
import java.util.EmptyStackException;

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
}
class StackTestDrive{


    public static void main(String[] args) {

        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{1,23,45,6});

        System.out.println(stack.pop());

//        for (String arg : args)
//            stack.push(arg);
//        while (!stack.isEmpty())
//            System.out.println(stack.pop().toUpperCase());




    }

}