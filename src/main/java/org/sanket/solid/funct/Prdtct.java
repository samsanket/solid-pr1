package org.sanket.solid.funct;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prdtct {
    public static void main(String[] args) {
        List<Integer> m1 = List.of(10, 20, 30, 40, 50);
        List<Integer> m2 = List.of(20, 30, 40, 60, 70);

        Predicate<Integer> contains= m2::contains;
        Predicate<Integer> notContains= (a)->!m2.contains(a);
        Set<Integer> result = m1.stream().filter(contains).collect(Collectors.toSet());
        Set<Integer> result2 = m1.stream().filter(notContains).collect(Collectors.toSet());

        Set<Integer> merge = Stream.concat(m1.stream(),m2.stream()).collect(Collectors.toSet());


        String str = "Hello , World";
      Map<Character,Long> res_count= str.chars().filter(c -> c != ' ') .mapToObj(c->(char)(c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    res_count.forEach((k,v)->System.out.println("k  " + k +  " v  " + v));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> booleanListMap = list.stream().collect(Collectors.partitioningBy(i -> i % 2 != 0));
    }

}
