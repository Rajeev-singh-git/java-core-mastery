package Lambda;

public class ConstructionReference {
    public static void main(String [] args){
        Details d = Student :: new;  // internally constructor is invoked
        Student s = d.getStudent("Rajeev");
    }
}


class Student{
    Student(String name){
        System.out.println(name +" is successfully enrolled!!!");   // Rajeev is successfully enrolled!!!
    }
}

interface Details{
    public Student getStudent(String name);
}