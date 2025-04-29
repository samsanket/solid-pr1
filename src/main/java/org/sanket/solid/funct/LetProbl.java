package org.sanket.solid.funct;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetProbl {

    public static void main(String[] args) {
        int [] arx = new int[]{1,2,3,4,5,6,1,1,2,3,5};
        List<Long> list = Stream.of(arx)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .toList();
        boolean b = list.stream().count() == list.stream().distinct().count();

    }
}