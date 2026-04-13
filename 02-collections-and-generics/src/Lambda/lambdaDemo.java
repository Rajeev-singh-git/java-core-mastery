package Lambda;

public class lambdaDemo{

    public static void main(String [] args){

         MyFunctionalInterface funInterLamba = ()-> System.out.println("Functional Method");
         funInterLamba.funMethod();
    }
}


interface MyFunctionalInterface{
    public void funMethod();
}