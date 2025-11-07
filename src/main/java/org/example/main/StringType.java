package org.example.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringType {
    public static void main(String[] args) {
        System.out.println("Let's solve some StringType Stream Question!!!");

        //Q.1)First Longest Word.
//        String sentence = "Java stream make funtional programming easy and powerfull";
//
//        String firstLongestLengthWord = Arrays.stream(sentence.split(" "))
//                .max(Comparator.comparingInt(String::length))
//                .get();
//        System.out.println(firstLongestLengthWord);

        //===============================================================================================================
        //Q.2) Mininmum Frquency Character.

//        String input = "banana applee";
//        input.replaceAll(" ","")    // "banana applee" --> "bananaapplee"
//                .chars() //IntStream ==> [98, 97, 110, 97, 110, 97, 97, 112, 112, 108, 101, 101]
//                .mapToObj(ch->(char)ch) //Converts each int (ASCII) into a Character object. Now it’s a Stream<Character>:[b, a, n, a, n, a, a, p, p, l, e, e]
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))//Map<Character,Long>==> {b=1,a=5,n=2,p=2,l=1,e=2}
//                .entrySet()//Converts the Map into a Set of key-value pairs: [(b=1),(a=5),(n=2),(p=2),(l=1),(e=2)]
//                .stream()//Stream of entries → (b=1), (a=5), (n=2), (p=2), (l=1), (e=2)
//                .min(Map.Entry.comparingByValue())//compares entries by their value (i.e., the count). Result: Optional[(b=1)]
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
//        String reversedSentence = Arrays.stream(sentence.split(" "))//["Krishna", "is", "the", "Supreme", "Lord", "of", "the", "Universe"]
//                .map(word -> new StringBuilder(word).reverse().toString())//"anhsirK" → "si" → "eht" → "emerpuS" → "droL" → "fo" → "eht" → "esrevinU"
//                .collect(Collectors.joining(" "));
//
//        System.out.println(reversedSentence);

        //Full Visualization of above code.
//        "Krishna is the Supreme Lord of the Universe"
//        ↓
//        split(" ")
//        ↓
//["Krishna", "is", "the", "Supreme", "Lord", "of", "the", "Universe"]
//        ↓
//        Arrays.stream(...)
//        ↓
//        Stream<String> → "Krishna", "is", "the", "Supreme", "Lord", "of", "the", "Universe"
//        ↓
//.map(word -> new StringBuilder(word).reverse().toString())
//        ↓
//        Stream<String> → "anhsirK", "si", "eht", "emerpuS", "droL", "fo", "eht", "esrevinU"
//        ↓
//.collect(Collectors.joining(" "))  joins all elements of the stream into a single string,inserting a space between each word.
//        ↓
//        "anhsirK si eht emerpuS droL fo eht esrevinU"


        //===============================================================================================================
        //Q.5) Find the Longest String in a List.

//        List<String> words = Arrays.asList("Apple","Banana","Strawberry","Kiwi","Grapefruit");
//        words.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);

        //===============================================================================================================

        //Q.6)Count occurence of word from Arraylist.

//        List<String> list = Arrays.asList("apple", "ball", "one", "ball", "row","one","one");
//
//        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .forEach((word,count)->System.out.println(word + ":" + count));

        //===============================================================================================================

        //Q.7) Count of each character in a string.
//        String salute = "Hare Krishna Devotees";
//
//        salute.toLowerCase() // "hare krishna devotees"
//                .replaceAll("\\s", "") // remove spaces ==> "harekrishnadevotees"
//                .chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .forEach((character,count)->System.out.println(character+":"+count));

        // Mental Flow:-

//        "Hare Krishna Devotees"
//                  ↓
//        toLowerCase() → "hare krishna devotees"
//                   ↓
//        replaceAll("\\s","") → "harekrishnadevotees"
//                     ↓
//        chars() → [104, 97, 114, 101, 107, ...]
//                   ↓
//        mapToObj(c -> (char)c) → ['h','a','r','e','k','r','i','s','h','n','a','d','e','v','o','t','e','e','s']
//                   ↓
//        groupingBy(Function.identity(), counting()) → {h=2, a=2, r=2, e=5, ...}
//                   ↓
//        forEach(...) → print key:value


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
//        input.chars() // [115, 119, 105, 115, 115]
//                .mapToObj(ch ->(char)ch) // Stream<Character>::->['s', 'w', 'i', 's', 's']
//                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new,Collectors.counting())) // {s=3, w=1, i=1}
//                .entrySet().stream() // ["s"=3, "w"=1, "i"=1]
//                .filter(entry->entry.getValue()==1) // ["w"=1, "i"=1]
//                .map(Map.Entry::getKey) // ['w', 'i']
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
