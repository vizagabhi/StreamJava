package org.example.main;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayType
{
    public static void main( String[] args )
    {
        //Creation from
//        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
//        Stream<Integer> stream = list.stream();
//        System.out.println(stream);
//        List<Integer> filteredList = list.stream()
//                                            .filter((n) -> n % 2 == 0)
//                                            .collect(Collectors.toList());
//
//        System.out.println(filteredList);
        System.out.println("Let's Solve Array type streams questions.");
//=======================================================================================================================
        //Q.1) Sum of elements in arraylist:

//        List<Integer> list1 = Arrays.asList(3, 5, 5, 6);
//
//        Integer sum = list1.stream().reduce((x, y) -> x + y).get();
//        System.out.println(sum);

        //OR

//        int sum = list1.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

//        Integer integerObj = Integer.valueOf(10); // Boxing: int to Integer
//        int primitiveInt = integerObj.intValue(); // Unboxing: Integer to int
//=====================================================================================================================
     // Q.2)Print Numbers Starts With Prefix '3' using Streams

//        List<Integer> list2 = Arrays.asList(2, 34, 45, 23, 55, 243, 319);
//
//        List<Integer> collect = list2.stream()
//                .map(e -> String.valueOf(e)) //Converting each Integer to String
//                .filter(x -> x.startsWith("3"))
//                .map(Integer::valueOf)  //Converting String to Integer
//                .collect(Collectors.toList());
//        System.out.println(collect);
// ====================================================================================================================
        //Q.3)Print Duplicate Numbers using Streams:-

//        List<Integer> list2 = Arrays.asList(2, 34, 45,45, 23, 55,55, 243, 319);
//        int frequency = Collections.frequency(list2, 5); //return frequency or count of the particular number in the collection.
//        System.out.println(frequency);
//        Set<Integer> collect = list2.stream()
//                    .filter(e -> Collections.frequency(list2, e) > 1)
//                    .collect(Collectors.toSet());

//        System.out.println(collect);

        //OR

//        Set<Integer> hs = new HashSet<>();
//        Set<Integer> collect = list2.stream().filter(x -> !hs.add(x)).collect(Collectors.toSet());
//        System.out.println(collect);

// ====================================================================================================================
        ///Q.4)Sort the given list in following manner ki even pahle sort ho in descending order and then odd number sort ho in descending order.
//        List<Integer> list = Arrays.asList(7, 6, 5, 4, 3, 2, 1);
//
//        List<Integer> evens = list.stream().filter(n -> n % 2 == 0).sorted((a, b) -> b - a).collect(Collectors.toList());
//        List<Integer> odds = list.stream().filter(n -> n % 2 != 0).sorted((a, b) -> b - a).collect(Collectors.toList());
//        List<Integer> collect = Stream.concat(evens.stream(), odds.stream()).collect(Collectors.toList());
//        System.out.println(collect);

//===========================================================================================================================================
        ///Q.5)Find all numbers starting with 1;
//        List<Integer> nums = Arrays.asList(10,21,13,41,15,2,1,100,23);
//
//                        nums.stream()
//                                .filter(x-> String.valueOf(x).startsWith("1"))
//                                .forEach(System.out::println);
        //==================================================================================================================================
        //Q.6) Check list contain Prime Number.

//        List<Integer> numbers = Arrays.asList(4,6,8,11,15,16);
//
//        boolean isPrime = numbers.stream().anyMatch(x->isPrime(x));
//        System.out.println("Does this list contain prime? "+isPrime);

        //==============================================================================================================
        //Q.7)nth smallest element in an array.
//        int arr[]= {12,3,5,4,7,8,13};
//        int n = 3;
        //Smallest
//        Arrays.stream(arr).sorted().skip(n-1).findFirst().ifPresent(System.out::println);

        //Highest
//        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().ifPresent(System.out::println);
        //=================================================================================================================

        //Q.8)In an array, return true if array contains duplicate element.

//        int nums[] = {1,2,3,3,4,5,6};
//
//        Set<Integer> numSet = new HashSet<>();
//        boolean response = Arrays.stream(nums).anyMatch(elm -> !numSet.add(elm));
//        System.out.println(response);

        //OR

//        boolean result = Arrays.stream(nums).distinct().count() != nums.length;
//        System.out.println(result);
        //=================================================================================================================

        //Q.9) Find the intersection / common element in 2 streams.
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

//        list1.stream().filter(elm->list2.contains(elm)).forEach(System.out::println);
        //==============================================================================================================
        //Q.10) Find sum of all digit of number.
//        int num = 12345;
//        int sum = String.valueOf(num).chars().map(elm -> Character.getNumericValue(elm)).sum();
//        System.out.println(sum);
         ////////////////////////OR/////////////////////////////////////////////////
//        int sum = String.valueOf(num)
//                .chars()
//                .map(c -> c - '0')
//                .sum();
        //===============================================================================================================

        //Q.11)Find out most repeated element in an Array.

//        int num[]= {3,3,2,2,1,1,1,2,3};
//        Arrays.stream(num)
//                .boxed()
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max(Comparator.comparingLong(Map.Entry::getValue))
//                .map(Map.Entry::getKey)
//                .ifPresent((elm->System.out.println("Most repeated no is : " +elm)));

        /////////////////////OR//////////////////////////////////////////

//        Integer[] arr = {1, 2, 2, 3, 1, 2, 4};
//
//        List<Integer> list = Arrays.asList(arr);
//
//        Integer mostRepeated = list.stream()
//                .distinct()
//                .max(Comparator.comparingInt(e -> Collections.frequency(list, e)))
//                .get();
//
//        System.out.println("Most repeated element: " + mostRepeated);
        //==============================================================================================================
        //Q.12)Print distinct numbers which ends with 1 in ascending order.

//        List<Integer> numbers = Arrays.asList(150,145,212,413,234,21,51,111,519,54,71,54,11,91);

//        numbers.stream()
//                .filter(num -> num%10==1)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

        //Variation : have 1 anywhere.
//        numbers.stream()
//                .filter(num->String.valueOf(num).contains("1"))
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);
        //==============================================================================================================

        //Q.13) Generate Fibonacci Sequence.

//        int n = 10;
//        Stream.iterate(new int[]{0,1},num -> new int[]{num[1],num[0]+num[1]})
//                .limit(n)
//                .map(num -> num[0])
//                .forEach(System.out::println);
        //==============================================================================================================

        //Q.14) Find the index of the closest element to a given value.

//        List<Integer> list = Arrays.asList(-10, 2, 3, 8, 15, 1);
//        int target = 5;
//
//        int closestIndex = IntStream.range(0, list.size())
//                .boxed()
//                .min(Comparator.comparingInt(ind -> Math.abs(list.get(ind) - target)))
//                .orElse(-1);
//
//        System.out.println("INdex of closest element is "+ closestIndex + " Closest value is " + list.get(closestIndex));

        //Variation: Find Even number closest to target.

//        list.stream()
//                .filter(num->num%2==0)
//                .min(Comparator.comparingInt((num->Math.abs(num-target))))
//                .ifPresent(System.out::println);
        //==============================================================================================================

        //Q.15) Find the closest number smaller than given number.

//        List<Double> list = Arrays.asList(3.4, 5.8, 1.2, 7.9, 9.6, 2.7, 6.2, 4.7, 0.6, 4.1);
//        double target = 5.0;
//
//        list.stream()
//                .filter(num ->num<target)
//                .max(Comparator.naturalOrder())
//                .ifPresent(System.out::println);
        //===============================================================================================================
        //Q.16)Implement a meethod to partition a list into 2 groups based on a predicate.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> partioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evens = partioned.get(true);
        List<Integer> odds = partioned.get(false);

        System.out.println("Evens: "+evens);
        System.out.println("Odds: "+odds);


    }

//    static  boolean isPrime(int num){
//        if(num<=1)
//            return false;
//
//        return IntStream.rangeClosed(2,(int)Math.sqrt(num)).noneMatch(i->num%i==0);
//    }
}
