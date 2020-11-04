package exceptions;

/**
 * @Autor: Vadym PIVAK
 * Date: 04/11/2020 12:01
 */
public class ExceptionsExercices {
    public static void main(String[] args) {

/**
 * Exercise Which letter will print when this code is run ? => Exception in thread "main" java.lang.Error
 */
//        try{
//            System.out.println("A");
//            badMethod();
//            System.out.println("B");
//        }catch (Exception e){
//            System.out.println("C");
//        }finally {
//            System.out.println("D");
//        }
//
//    }
//
//    private static void badMethod() {
//        throw new Error();

        int[] ints = {-9, 14, 37, 102};
        System.out.println(ExceptionsExercices.exists(ints, 102)); // true
        System.out.println(ExceptionsExercices.exists(ints, 36)); // false



    }

    static boolean exists(int[] ints, int k) {
        int in;

        for(int i = 0; i < ints.length; i++){
            if(ints[i] == k){
                return true;
            };

        }
        return false;
    }

}
