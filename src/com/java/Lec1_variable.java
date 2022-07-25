package com.java;
import com.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec1_variable {

    public static void main(String[] args) {
        long number1 = 10L;
        final long number2 = 10L;

        Long number3 = 1_000L;
        Person person = new Person("Jihun");


        // final 컬렉션에 element 추가 가능
        final List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2));
        numbers.add(3);  // 컬렉션에 값 추가 가능

    }

}