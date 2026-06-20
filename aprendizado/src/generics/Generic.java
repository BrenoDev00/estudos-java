package aprendizado.src.generics;

import java.util.ArrayList;
import java.util.List;

// o T representa tipo genérico usado na classe
public class Generic<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}

class Main {
    public static void main(String[] args) {
        Generic<String> names = new Generic<String>();
        names.addValue("Karol");
        names.addValue("Julian");
        names.print();

        Generic<Integer> numbers = new Generic<Integer>();
        numbers.addValue(23);
        numbers.addValue(45);
        numbers.print();
    }
}