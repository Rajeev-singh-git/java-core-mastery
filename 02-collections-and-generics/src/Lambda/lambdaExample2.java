package Lambda;

public class lambdaExample2 {

    public static void main(String [] args){
        MyInterface i = (a,b) -> System.out.println("Sum of a and b is : "+(a+b));
        i.funMethodAdd(10,20);
    }


}

interface MyInterface{
    public void funMethodAdd(int A, int B);
}
