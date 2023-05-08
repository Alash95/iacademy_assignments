package I_Academy.generics;

import java.util.ArrayList;

public class GenericsStuff<E> {

    private ArrayList<E> list = new ArrayList<E>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(E element) {
        list.add(element);
    }

    public E pop() {
        int lastIndex = list.size() - 1;
        return list.remove(lastIndex);
    }

    public E peek() {
        int lastIndex = list.size() - 1;
        return list.get(lastIndex);
    }

    public Integer size() {
        return list.size();
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        GenericsStuff<String> stack = new GenericsStuff<>();

        System.out.println(stack.isEmpty());

        stack.push("Emperor");
        stack.push("Riddoh");
        stack.push("Noah");
        stack.push("Pelorina");
        stack.push("carpenter");

        System.out.println(stack.size());

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        stack.display();






    }
}
