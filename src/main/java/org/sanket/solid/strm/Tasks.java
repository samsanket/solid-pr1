package org.sanket.solid.strm;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//
//➡️ Java 8 Program to Remove Duplicate Elements from a List
//➡️ Reverse Each Word of String using Java 8 Stream
//➡️ Java 8 Program to Find the Second Largest Number in the List of Integers
//➡️ Java 8 Program to Find the Maximum Number and Minimum Number in a List
//➡️ Sort Employee Objects by Salary using Lambda
//➡️ Java 8 Program to Find the Sum of All Digits of a Number
//➡️ Java 8 Program to Find the Frequency of Each Character in a Given String
//➡️ Java 8 Program to Find the Maximum Number and Minimum Number in a List
//➡️ Java 8 Program to Print Even Numbers from a List
//➡️ Find the Square of the First Three Even Numbers using Java 8 Stream
//➡️ Find the Average of a Given List of Numbers using Java 8 Stream
//➡️ Convert a List of Strings to Uppercase and Lowercase using Java 8 Stream
//➡️ Collectors groupingBy - Group Employees By Age
//➡️ Java 8 Program to Find the Age of a Person if the Birthday Date has Given
//➡️ Sort the List of Strings in Ascending and Descending Order using Java 8 Stream
public class Tasks {


    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,3,1,2,3,4,5,6,7,8,9,11,14);
        Set<Integer> set = arr.stream().distinct().collect(Collectors.toSet());
        set.forEach(System.out::println);


        Stream<Integer> stream = arr.stream();
        Map<Integer, List<Integer>> collect = stream.
                collect(Collectors.groupingBy(Function.identity()));


        List<Integer> duplicate = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // filter only duplicates
                .map(Map.Entry::getKey)
                .toList();

        Set<Map.Entry<Integer, Long>> collect1 = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .collect(Collectors.toSet());


        collect.forEach((k,v)->System.out.println(" key "+ k + "value" + v));



       // Reverse Each Word of String using Java 8 Stream

        String str = "Hello sanket Deshpande";

        String[] s = str.split(" ");

        List<StringBuilder> rev_string = Arrays.stream(s)
                .parallel()
                .filter(a->!a.equals(""))
                .map(a -> new StringBuilder(a)
                        .reverse())
                .toList();

        rev_string.forEach(System.out::println);


//        Java 8 Program to Find the Second-Largest Number in the List of Integers

        List<Integer> ints = Arrays.asList(100,55,66,77,88,22,11,45,67,90);

       Optional<Integer> second_max = ints.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(second_max);

        int max=Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for (int i =0;i<ints.size();i++){
            if(ints.get(i)>max){
                sec_max=max;
                max=ints.get(i);
            } else if (ints.get(i)>sec_max && ints.get(i)!=sec_max) {
                sec_max=ints.get(i);
            }
        }

        List<Employee> employees = Arrays.asList(new Employee(1,80,"A",32),
                new Employee(2,90,"B",34)
        ,new Employee(3,60,"C",32),new Employee(4,40,"D",34)
        ,new Employee(5,80,"E",31));

        SortSalary sortSalary = (employees1 -> employees1.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList()));

        List<Employee> sortedEmployee = sortSalary.sortBySalary(employees);

        sortedEmployee.forEach( e-> {
                    System.out.println(" Name " +e.getName() + "name "+ e.getSalary());
                }
        );

//        Java 8 Program to Find the Sum of All Digits of a Number


        Integer number = 123456789;

        long sum = Stream.of(number)
                .collect(Collectors.summarizingInt(Integer::intValue)).getSum();


//        Java 8 Program to Find the Frequency of Each Character in a Given String


      String given = "Frequency";
        Map<Character, Long> collect3 = given.chars()
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        ArrayList<String> arrayList= new ArrayList<>();

        Map<char[], Long> repete = Stream.of(given.toCharArray()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        collect3.forEach((k,v)->System.out.println("key " + k + " value " + v));
        repete.forEach((k,v)->System.out.println("key " + k + " value " + v));

//        Map<Character, Long> rep = Arrays.stream(given.toCharArray()) // creates IntStream
//                .boxed()                                                     // boxes each char to Character
//                .collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting()
//                ));

        List<Integer> integerList = ints.stream().filter(a -> a % 2 == 0).toList();
        integerList.forEach(System.out::println);


//        Find the Square of the First Three Even Numbers using Java 8 Stream

        List<Integer> list = ints.stream().filter(a -> a % 2 == 0).limit(3).map(a -> a * a).toList();
        list.forEach(System.out::println);

        // Find the Average of a Given List of Numbers using Java 8 Stream
        Double sum_of_int = ints.stream().collect(Collectors.averagingInt(a -> a));
        System.out.println(sum_of_int);

        //Convert a List of Strings to Uppercase and Lowercase using Java 8 Stream

        List<String> names = Arrays.asList("Sanket","vikas","girish","abhishek");
        List<String> upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        upper.forEach(System.out::println);

        // Collectors groupingBy - Group Employees By Age

        Map<Integer, List<Employee>> group_by_age = employees.stream().collect(Collectors.groupingBy(Employee::getAge));


        group_by_age.forEach((age, empList) -> {
            System.out.println("Age: " + age);
            empList.forEach(emp -> System.out.println("  " + emp));
        });



    }
}

class Employee{
    private int  id;
    private int salary;
    private String name;
    private int age;

    public Employee(int id, int salary, String name ,int age) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.age=age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


@FunctionalInterface
interface SortSalary{
    public List<Employee> sortBySalary(List<Employee> employees);
}

