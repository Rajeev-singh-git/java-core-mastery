package Lambda;

import java.util.function.Function;

public class lambdaFunction {

    public static void main(String[]args){
        String s = "BasicStrong";
        Function<String,Integer> fun = str -> str.length();
        int len = fun.apply(s);
        System.out.println(len);     // 11
    }
}
