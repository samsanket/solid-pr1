package org.sanket.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(1);
        Set<Integer> collect1 = l1.stream().distinct().collect(Collectors.toSet());
        collect1.forEach(System.out::println);

        Map<Integer, List<Integer>> collect = l1.stream().map(a -> a).collect(Collectors.groupingBy(Function.identity()));
        collect.forEach((k,v)->System.out.println("key " + k + " value " + v));
    }
}
