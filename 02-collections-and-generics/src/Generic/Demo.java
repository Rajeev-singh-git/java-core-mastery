package Generic;

public class Demo {
    public static void main(String []args){
        Data d1 = new Data("This is D1");

        System.out.println(d1.toString());

        Data d2= new Data(10);
        System.out.println(d2.toString());

        IData<String> d3 = new Data<>("We have implemented generic interface");
        System.out.println(d3.toString());

    }

}
