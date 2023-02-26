package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterfaceCreator {

    public static Operation<Integer> divideBy(Integer divider) {
       // Operation divide = (x) -> x.forEach(i-> i/divider);
      return n -> n.stream().map(integer -> integer/divider).collect(Collectors.toList());
        // throw new UnsupportedOperationException("You should implement this method.");
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(4);
        integers.add(6);
        System.out.println(divideBy(2).apply(integers));
    }
}
