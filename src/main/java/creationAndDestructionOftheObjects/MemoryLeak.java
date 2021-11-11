package creationAndDestructionOftheObjects;

import java.util.EmptyStackException;

public class MemoryLeak {

    public static void main(String[] args) {

        // Can you spot the "memory leak"?
        class Stack {
            private Object[] elements;
            private int size = 0;

            public Stack(int initialCapacity) {
                this.elements = new Object[initialCapacity];
            }

            public void push(Object e) {
                ensureCapacity();
                elements[size++] = e;
            }
            public Object pop() {
                if (size == 0)
                    throw new EmptyStackException();
                return elements[--size];
            }
            /**
             * Ensure space for at least one more element, roughly
             * doubling the capacity each time the array needs to grow.
             */
            private void ensureCapacity() {
                if (elements.length == size) {
                    Object[] oldElements = elements;
                    elements = new Object[2 * elements.length + 1];
                    System.arraycopy(oldElements, 0, elements, 0, size);
                }
            }
        }

        System.out.println( new Stack(20).hashCode());
    }
}
