public class Appstudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.rollno);
        Student s2 = new Student("Rajesh",105, 78);
       // s1. name = "Deepa";
       // s1.rollno = 101;
       // s1.marks = 25;
        //s2. name = "Rajesh";
       // s2.rollno = 102;
       // s2.marks = 25;

        s1.ifStudentPassOrFail();
        s2.ifStudentPassOrFail();
    }
}
