package Lambda;

public class withoutPredicate {
    public static void main(String []args){
        int salary = 5000;

        boolean result = salaryCheck(salary);
        System.out.println(result);
    }
    private static boolean salaryCheck(int salary) {
        if(salary>= 5000){
            return true;
        }else {
            return false;
        }
    }
}
