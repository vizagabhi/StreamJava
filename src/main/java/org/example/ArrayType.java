package org.example;

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
    }
}
