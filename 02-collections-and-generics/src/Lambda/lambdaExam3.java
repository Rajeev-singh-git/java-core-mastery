package Lambda;

public class lambdaExam3 {

    public  static void main(String[]args){
        MyfunInterface3 myfun = (s) -> s.length();
        System.out.println(myfun.findLength("Rajeev Singh"));
    }
}


interface MyfunInterface3{
    public int findLength(String s);

}
