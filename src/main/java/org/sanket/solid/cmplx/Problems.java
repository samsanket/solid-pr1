package org.sanket.solid.cmplx;

import java.util.*;
import java.util.stream.Collectors;

public class Problems {

    public static void main(String[] args) {

//        Flatten a Map<String, List<Integer>> into a Sorted List of Unique Integers

        Map<String, List<Integer>> inputMap = new HashMap<>();
        inputMap.put("A", Arrays.asList(4, 2, 7, 2));
        inputMap.put("B", Arrays.asList(3, 9, 4, 6));
        inputMap.put("C", Arrays.asList(8, 1, 3, 9));

                // A List<Integer> containing all integers from all lists, flattened, duplicates removed, and sorted in ascending order.
        // [1, 2, 3, 4, 6, 7, 8, 9]


        Set<Integer> unique = inputMap.values().stream().flatMap(List::stream).collect(Collectors.toSet());
        unique.forEach(System.out::println);



        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 28),
                new Employee(2, "Bob", 35),
                new Employee(3, "Charlie", 40),
                new Employee(4, "Diana", 31),
                new Employee(5, "Eve", 25),
                new Employee(6, "Frank", 50)
        );

        String emps = employees.stream().filter(employee -> employee.getAge() > 30).map(a -> a.getName()).collect(Collectors.joining(", "));
    }
}

class Employee {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
