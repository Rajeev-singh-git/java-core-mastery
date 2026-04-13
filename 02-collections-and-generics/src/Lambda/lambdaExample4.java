package Lambda;

public class lambdaExample4 {

    public static  void main(String []args){
        MyFunInterface4 myFun = a -> {
            int res = a + 10;
            res = res / 2;
            return res;
        };
        int i = myFun.doSomeCalculation(20);
        System.out.println(i);
 }
}



interface MyFunInterface4{
    public int doSomeCalculation(int a);
}
