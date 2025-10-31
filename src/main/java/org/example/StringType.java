package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringType {
    public static void main(String[] args) {
        System.out.println("Let's solve some StringType Stream Question!!!");

        //Q.1)First Longest Word.
//        String sentence = "Java stream make funtional programming easy and powerfull";
//
//        String firstLongestLengthWord = Arrays.stream(sentence.split(" "))
//                .max(Comparator.comparingInt(String::length))
//                .stream()
//                .findFirst()
//                .get();
//        System.out.println(firstLongestLengthWord);

        //===============================================================================================================
        //Q.2) Mininmum Frquency Character.

//        String input = "banana applee";
//        input.replaceAll(" ","").chars()
//                .mapToObj(ch->(char)ch)
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet()
//                .stream()
//                .min(Map.Entry.comparingByValue())
//                .ifPresent(ch-> System.out.println("Character wid min freq is: "+ch));

        //===============================================================================================================

        // Q.3) 2 given Strings are anagram or not ?

//        String s1 = "Listen";
//        String s2 = "Silentz";
//
//        boolean result = isAnagram(s1, s2);
//        System.out.println(result ? "Anagram" : "Not Anagram");

        //===============================================================================================================

        //Q.4) Reverse each word of a String.

//        String sentence = "Krishna is the Supreme Lord of the Universe";
//
//        String reversedSentence = Arrays.stream(sentence.split(" "))
//                                        .map(word -> new StringBuilder(word).reverse().toString())
//                                        .collect(Collectors.joining(" "));
//
//        System.out.println(reversedSentence);

        //===============================================================================================================
        //Q.5) Find the Longest String in a List.

//        List<String> words = Arrays.asList("Apple","Banana","Strawberry","Kiwi","Grapefruit");
//        words.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);

        //===============================================================================================================

        //Q.6)Count occurence of word from Arralist.

//        List<String> list = Arrays.asList("apple", "ball", "one", "ball", "row","one","one");
//
//        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .forEach((word,count)->System.out.println(word + ":" + count));

        //===============================================================================================================

        //Q.7) Count of each character in a string.
//        String salute = "Hare Krishna Devotees";
//
//        salute.toLowerCase()
//                .replaceAll("\\s", "") // remove spaces
//                .chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .forEach((character,count)->System.out.println(character+":"+count));

        //===============================================================================================================

        //Q.8) Word wid 'n'th highest length.

//        List<String> words = Arrays.asList("apple", "banana", "kiwi", "cherry", "mango");
//        words.stream()
//                .sorted(Comparator.comparingInt(String::length).reversed())
//                .skip(3)//n=2 means finding 3rd highest
//                .findFirst().ifPresent(System.out::println);

        //===============================================================================================================

        //Q.9) Given a string, find the first non-repeated character.

//        String input = "swiss";
//
//        input.chars()
//                .mapToObj(ch ->(char)ch)
//                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new,Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry->entry.getValue()==1)
//                .map(Map.Entry::getKey)
//                .findFirst().ifPresent(System.out::println);

        //===============================================================================================================

        //Q.10) Find the words with 'k' vowels in a given sentence

//        String sentence = "I have an apple and orange on the table";
//
//        int k =2;
//
//        Arrays.stream(sentence.split(" "))
//                .filter(words -> countVowels(words)==k)
//                .forEach(System.out::println);
        //===============================================================================================================

        //Q.11) String is Palindrome or not?

//        String input = "madam";
//        boolean isPalindrome = IntStream.range(0,input.length()/2)
//                                        .allMatch(i-> input.charAt(i)==input.charAt(input.length()-1-i));
//        System.out.println(isPalindrome);

        //===============================================================================================================

        //Q.12) Remove duplicate from a list and preserve order.
//        List<String> list = Arrays.asList("apple", "ball", "apple", "one", "ball");
//        list.stream().distinct().forEach(System.out::println);

        //OR

//        list.stream().collect(Collectors.toSet()).forEach(System.out::println);

        //OR

//        new HashSet<>(list).forEach(System.out::println);

    }

//    private static long countVowels(String words) {
//        return words.chars()
//                .mapToObj(ch->(char)ch)
//                .filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
//                .count();
//    }

//    static boolean isAnagram(String str1, String str2){
//
//        // Clean up strings
//        str1 = str1.replaceAll("\\s", "").toLowerCase();
//        str2 = str2.replaceAll("\\s", "").toLowerCase();
//
//        if (str1.length() != str2.length()) return false;
//
//        // Build frequency map for each string
//        Map<Character, Long> freq1 = str1.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        Map<Character, Long> freq2 = str2.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        return freq1.equals(freq2);
//    }
}
