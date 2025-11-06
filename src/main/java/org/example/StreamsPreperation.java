package org.example;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPreperation {
    public static void main(String[] args) {
        //Find the Sum of All Elements in a List
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 4, 214124, 434, 232, 221);
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());

        System.out.println("sum:"+numbers.stream().reduce(Integer::sum).get());


        //2. Find the Product of All Elements in a List
        int product = numbers.stream().reduce((a, b) -> a * b).get();
        System.out.println("Product: " + product);

        //3. Find the Average of All Elements in a List
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Avg: " + avg);

        // 4. Find the Maximum Element in a List

        int max = numbers.stream().max((a, b) -> a - b).get();
        System.out.println("Max: " + max);

        // 4. Find the Maximum Element in a List

        int min = numbers.stream().min((a, b) -> a - b).get();
        System.out.println("min: " + min);

//        6. Count the Number of Elements in a List

        long count = numbers.stream().mapToInt(Integer::intValue).count();
        System.out.println("Count: " + count);


        //7. Check if a List Contains a Specific Element
        boolean contains = numbers.stream().anyMatch(x -> x == 123);
        System.out.println("Contains: " + contains);

        //. Filter Out Even Numbers from a List
        List<Integer> list = numbers.stream().filter(x -> x % 2 == 0).toList();
        System.out.println("even: " + list);

        //9. Filter Out Odd Numbers from a List

        List<Integer> odd = numbers.stream().filter(x -> x % 2 != 0).toList();
        System.out.println("odd: " + odd);


//        10. Convert a List of Strings to Uppercase
        List<String> words = List.of("hello", "world");
        List<String> wordUppercase = words.stream().map(String::toUpperCase).toList();
        System.out.println("words: " + wordUppercase);

//        11. Convert a List of Integers to Their Squares
        List<Integer> list1 = numbers.stream().map(x -> x * x).toList();
        System.out.println("list1: " + list1);

        //12. Find the First Element in a List
        int first = numbers.stream().findFirst().get();

        System.out.println("first: " + first);

        //13. Find the Last Element in a List
        int last = numbers.stream().reduce((a, b) -> b).get();
        System.out.println("last: " + last);

//        14. Check if All Elements in a List Satisfy a Condition

        boolean isEven = numbers.stream().allMatch(x -> x > 0);
        System.out.println("isEven: " + isEven);

//        Check if Any Element in a List Satisfies a Condition
        boolean isanyMatch = numbers.stream().anyMatch(x -> x > 1000);
        System.out.println("isanyMatch: " + isanyMatch);

//        16. Remove Duplicate Elements from a List

        List<Integer> list2 = numbers.stream().distinct().toList();
        System.out.println("distincts: " + list2);

//        17. Sort a List of Integers in Ascending Order

        List<Integer> list3 = numbers.stream().sorted().toList();
        System.out.println("sorted: " + list3);

//        18. Sort a List of Integers in Descending Order
        List<Integer> list4 = numbers.stream().sorted((a, b) -> b - a).toList();
        System.out.println("sorted descending: " + list4);


//        19. Sort a List of Strings in Alphabetical Order
        List<String> wordsList = List.of("baa", "apple", "cherry");
        List<String> list5 = wordsList.stream().sorted().toList();
        System.out.println("sorted: string list  " + list5);

//      20. Sort a List of Strings by Their Length
        List<String> list6 = wordsList.stream().sorted((a, b) -> a.length() - b.length()).toList();
        System.out.println("sorted: string list  " + list6);

        //21. Find the Sum of Digits of a Number
        int number = 12345;

        int sum = String.valueOf(number).chars().map(Character::getNumericValue).sum();
        System.out.println("sum: " + sum);


//        22. Find the Factorial of a Number
        int num = 5;
        int factorial;
        factorial = IntStream.rangeClosed(1, num).reduce((a, b) -> a * b).getAsInt();
        System.out.println("factorial: " + factorial);

//        23. Find the Second-Largest Element in a List
        int res = numbers.stream().sorted((a, b) -> b - a).skip(1).findFirst().get();
        System.out.println("res: " + res);

//        24. Find the Second-Smallest Element in a List
        int res2 = numbers.stream().sorted().skip(1).findFirst().orElse(0);
        System.out.println("res2: " + res2);

//        25. Find the Longest String in a List
        String longestString = wordsList.stream().max((a, b) -> a.length() - b.length()).orElse("");

        System.out.println("longestString: " + longestString);

//        26. Find the Shortest String in a List
        String shortestString = wordsList.stream().min((a, b) -> a.length() - b.length()).orElse("");

        System.out.println("shortestString: " + shortestString);

//        27. Group a List of Strings by Their Length
        Map<Integer, List<String>> collect = wordsList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("groupby length: " + collect);

        Person abhi = new Person("abhilash",25);
        Person sagar = new Person("sagar",25);
        Person pushya = new Person("pushya",22);
        Person satya = new Person("satya",22);

        List<Person> people = Arrays.asList(abhi, sagar, pushya, satya);
        Map<Integer, List<Person>> collect1 = people.stream().collect(Collectors.groupingBy(x -> x.age));
        System.out.println("groupBy age: " + collect1);

//        29. Partition a List of Integers into Even and Odd Numbers

        Map<Boolean, List<Integer>> geoupByEvenOdd = numbers.stream().collect(Collectors.partitioningBy((x -> x % 2 == 0)));
        System.out.println("geoupByEvenOdd: " + geoupByEvenOdd);

//        30. Merge Two Lists into a Single List
        List<Integer> listx = List.of(1, 2, 3);
        List<Integer> listy = List.of(4, 5, 6);
        List<Integer> list7 = Stream.concat(listx.stream(), listy.stream()).toList();
        System.out.println(list7);

        List<Integer> listA = List.of(1, 2, 3, 4);
        List<Integer> listB = List.of(3, 4, 5, 6);
        List<Integer> list8 = listA.stream().filter(listB::contains).toList();
        System.out.println(list8);
        //32. Find the Union of Two Lists
        Set<Integer> collect2 = Stream.concat(listA.stream(), listB.stream()).collect(Collectors.toSet());
        System.out.println(collect2);

    }



}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Constructor, getters, and setters
}
