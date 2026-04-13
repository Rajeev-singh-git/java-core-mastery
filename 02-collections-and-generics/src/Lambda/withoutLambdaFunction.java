package Lambda;

import java.util.function.Function;

public class withoutLambdaFunction {

   public static void main(String[]args){
       String s = "BasicStrong";
       int len = calLength(s);
       System.out.println(len);
   }

    private static int calLength(String s) {
       return s.length();
    }
}
