package org.example.dpp;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class DailyPractice {
    public static void main(String[] args) {

        //Given a list of strings, count how many strings start with the letter 'A'.

//        List<String> namelist = Arrays.asList("Aman", "Suman", "Naman", "Arnav", "Akash","Akbar");
//
//        long count = namelist.stream().filter(str -> str.startsWith("A")).count();
//        System.out.println(count);

        //Find minimum and maximum
//        List<Integer> list = Arrays.asList(67, 45, 87, 34, 98, 24, 34, 76);
//        list.stream().max((a,b)->a-b).ifPresent(System.out::println);
//        list.stream().min((a,b)->a-b).ifPresent(System.out::println);

        //But what if array are of primitive integers?

//        int arr[]={23,97,67,56,38,84,56};
//        Arrays.stream(arr).boxed().min((x,y)->x-y).ifPresent(System.out::println);

        //From a list of integers, print only the duplicate elements using streams.

//        List<Integer> list = Arrays.asList(25, 49, 34, 54, 34, 49, 34, 67,5,5,5,5,5,78);
//        Set<Integer> hs = new HashSet<>();
//        list.stream().filter(x->!hs.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

        // Remove Duplicate

//        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);
//        HashSet<Integer> set = new HashSet<>();
//        numbers.stream().filter(set::add).toList().forEach((x) -> System.out.print(x + " "));

        //Freq of each character
//        String str = "interview";
//        Map<Character, Long> collect = str.codePoints().mapToObj(i -> (char) i)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//        collect.forEach((k, v) -> {
//            System.out.println(k + "=" + v);
//        });

        // First Non Repeating char
        String str = "aabbcddeff";

        str.codePoints().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
