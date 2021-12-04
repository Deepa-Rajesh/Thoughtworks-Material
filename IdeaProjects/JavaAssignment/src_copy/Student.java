public class Student {
    String name;
    int rollno;
    int marks;

   public Student(){
        this.rollno = 1;
    }
    public Student(String name, int rollno, int marks){
       this.name = name;
       this.rollno = rollno;
       this.marks = marks;
    }

    void ifStudentPassOrFail(){

        if(marks > 50 ){
            System.out.println("pass");}
         else{
            System.out.println("fail");
        }
    }
}
