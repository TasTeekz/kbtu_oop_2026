package lab3.problem3;

import lab3.problem3.model.*;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> list = new MyArrayList<>();

        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        System.out.println("size: " + list.size());
        System.out.println("comtains 'elem1': " + list.contains("elem1"));
        System.out.println("contains 'elem4': " + list.contains("elem4"));
        System.out.println();

        MyCollection<String> set = new MySet<>();

        set.add("elem1");
        set.add("elem2");
        boolean added = set.add("elem1");

        System.out.println("added duplicate 'elem1': " + added);
        System.out.println("size: " + set.size());
        System.out.println("contains 'elem2': " + set.contains("elem2"));

        set.remove("elem2");
        System.out.println("contains 'elem2': " + set.contains("elem2"));
        System.out.println("size: " + set.size());
    }
}
