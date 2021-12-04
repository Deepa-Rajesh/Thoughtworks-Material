public class Commercestudent extends Student{

    public static void main(String[] args) {
        int accMarks;
        int ecoMarks;
        int bsMarks;

        Commercestudent cs = new Commercestudent();
        cs.rollno = 102;
        cs.name = "Rajesh";
        cs.address = "JP nagar";
        cs.contactnum = 944467854;
        accMarks = 59;
        ecoMarks = 75;
        bsMarks = 80;
        cs.studentDetail();
        System.out.println("Accounts marks " + accMarks);
        System.out.println("Economics Marks" + ecoMarks);
        System.out.println("BusinessStudies Marks" + bsMarks);


    }
}
