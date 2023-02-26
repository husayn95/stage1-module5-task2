package com.epam.mjc;

public class InterfaceCreator {

    public static Operation<Integer> divideBy(Integer divider) {
       //  Operation divide = (x) -> x.forEach(i-> i);
      return n -> n.forEach(integer ->  integer/divider);
        // throw new UnsupportedOperationException("You should implement this method.");
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
