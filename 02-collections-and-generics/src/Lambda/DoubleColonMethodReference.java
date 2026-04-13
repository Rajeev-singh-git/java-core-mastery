package Lambda;

public class DoubleColonMethodReference {

    public static void main(String [] args){
        MyFunInterfaceNew funInter = () -> System.out.println("I am Lambda");
        funInter.method1();                  // I am not a Lambda
    }

    public static void method2(){
        System.out.println("I am not a lambda");
    }

    public  void method3(){
        System.out.println("I am here, instance method :)");
    }

}
interface MyFunInterfaceNew{
    public void method1();
}


/*  We are providing implementation to the "method1" of  "MyFunInterfaceNew" by "method2" of class
"DoubleColonMethodReference" using Double Colon Reference.

** Method argument has to be same to refer to the method.

Here, method1() and method2() both are not having any argument.

 */
class NewCallerClass{
    public static void main(String[]args){
        // For Static method
        MyFunInterfaceNew i = DoubleColonMethodReference :: method2;
        i.method1();                                                                     // I am not a lambda

        // For Instance method
        DoubleColonMethodReference obj = new DoubleColonMethodReference();
        MyFunInterfaceNew i1 = obj :: method3;
        i1.method1();                                                                     // I am here, instance method :)
    }

}
