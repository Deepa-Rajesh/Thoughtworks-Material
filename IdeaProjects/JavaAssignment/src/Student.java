public class Student {
    String name;
    int rollno;
    String address;
    int contactnum;
   // static int marks;
    static int no_Of_Student;

   public Student(){
        this.rollno = 1;
       Student.no_Of_Student = Student.no_Of_Student + 1;
    }
    public Student(String name, int rollno){
       this.name = name;
       this.rollno = rollno;
       this.contactnum = contactnum;
       this.address = address;
      // this.marks = marks;
        Student.no_Of_Student = Student.no_Of_Student + 1;
    }

void studentDetail(){
    System.out.println("Student Roll no. " + rollno);
    System.out.println("Student Name :" + name);
    System.out.println("Address :" + address);
    System.out.println("Contact number :" + contactnum);


   /* static void ifStudentPassOrFail(){

        if(marks > 50 ){
            System.out.println("pass");}
         else{
            System.out.println("fail");
        }*/
    }
}
