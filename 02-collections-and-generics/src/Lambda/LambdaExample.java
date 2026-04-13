package Lambda;

public class LambdaExample {

    public static void main(String []args){
        //FunInterFaceExample i = new ImpFunInterfaceExample();
        FunInterFaceExample i = () ->  System.out.println("Function without any argument and return type");
        i.funMethod();
    }

}

interface FunInterFaceExample{
    public void funMethod();
}

/*
class ImpFunInterfaceExample implements FunInterFaceExample{
    @Override
    public void funMethod(){
        System.out.println("Function without any argument and return type");
    }
}
*/