package string;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @Autor: Vadym PIVAK
 * Date: 04/11/2020 16:16
 */
public class StringUtils {

    static String concat (String ... strings){

        StringBuilder sb = new StringBuilder();
        Iterator it = Arrays.asList(strings).iterator();

        while(it.hasNext()){
           sb.append(it.next());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String [] strings = {"f","o","o","bar"};
        System.out.println(concat(strings));
    }

}
