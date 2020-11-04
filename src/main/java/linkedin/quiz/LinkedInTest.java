package linkedin.quiz;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Autor: Vadym PIVAK
 * Date: 26/10/2020 16:50
 */
public class LinkedInTest {
    public static void main(String... args) {

//        System.out.println("apple".compareTo("banana"));
//        System.out.println("abcdefg".substring(2,5));
//        List<String> names = new ArrayList<>(Arrays.asList("Vadym","Anna","Danko","Allan","Marita","Olga"));
//        Collections.sort(names);
//        names.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
//        names.sort(List.DESCENDIG);   WRONG
//        names.sort(Comparator.comparing(String::toString));
//        System.out.println(names);

//        int nmr = 123451234512345;  will obt compile as int too large
//        System.out.println(nmr);

        int [] array = {1,5,6,4,9,8,3,10};
        for(int i = 0; i < array.length; ++i){
            System.out.println(i+"/"+array.length+":"+ array[i]);
        }






    }




}
