package list;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorEnumDemo {

    public  static  void main(String[]args){
        Vector v = new Vector();
        System.out.println("Enter the elements :");

        for(int i=0;i<8;i++){
            Scanner s = new Scanner(System.in);
            Integer data = s.nextInt();
            v.addElement(data);
        }
        System.out.println("Vector : " +v);  //  Vector : [12, 3, 11, 334, 55, 22, 66, 22]

        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            Integer element = (Integer)e.nextElement();

            if(element % 3 == 0){

                System.out.println(element);
            }
        }

    }

}
