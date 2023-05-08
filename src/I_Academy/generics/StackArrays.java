package I_Academy.generics;

import java.util.Arrays;

public class StackArrays<E> {

    private E[] arrays;
    int size = 0;

    public StackArrays(int size) {
        this.arrays = (E[]) new Object[size];
    }

    public boolean isEmpty() {
        for (E elements: arrays) {
            if (elements != null) {
                return false;
            }
        }
        return true;
    }

    public void push(E element) {
        if (size == arrays.length) {
            // Resize the array
            arrays = Arrays.copyOf(arrays, arrays.length * 2);
        }
        arrays[size++] = element;
    }

    public E pop() {
        int lastIndex = size - 1;
        E lastElement = arrays[lastIndex];
        arrays[lastIndex] = null;
        size--;

        return lastElement;
    }

    public E peek() {
//        int lastIndex = size - 1;
//        E element = null;
//        for (int i = 0; i < lastIndex; i++) {
//            element = arrays[i];
//        }
        return arrays[size - 1];
//    return arrays[size-1];
    }

    public Integer size(){
//        int count = 0;
//        for (E elements: arrays){
//            count++;
//        }
        return size;
    }

    public void display() {
        for (E elements: arrays) {
            if (elements != null){
                System.out.println(elements);
            }
        }
    }

    public static void main(String[] args) {
        StackArrays<String> stackArrays = new StackArrays<>(10);

        System.out.println(stackArrays.isEmpty());


        stackArrays.push("Emperor");
        stackArrays.push("Riddoh");
        stackArrays.push("Noah");
        stackArrays.push("Pelorina");
        stackArrays .push("carpenter");

        System.out.println(stackArrays.size());

        System.out.println(stackArrays.isEmpty());
        System.out.println(stackArrays.peek());
        System.out.println(stackArrays.pop());
        System.out.println(stackArrays.size());

        stackArrays.display();

    }



}
