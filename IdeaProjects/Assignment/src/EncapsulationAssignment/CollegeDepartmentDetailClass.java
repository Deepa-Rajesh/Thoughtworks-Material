package EncapsulationAssignment;// java program for Encapsulation
import java.util.ArrayList;
import java.util.List;

public class CollegeDepartmentDetailClass {
    // creating private variable
    private String collegeName;
    private ArrayList<String> departmentName;

    // method to get College name
    public String getCollegeName() {
        return collegeName;
    }
    // Method to set College name
    public void setCollegeName(String colName) {
        this.collegeName = colName;
    }
    // method to get Department name
    public ArrayList< String> getDepartmentName(){
        return departmentName;
    }
    // Method to set Department name
    public void setDepartmentName(ArrayList<String> deptName){
        this.departmentName = deptName;
    }

}
    class CollegeDepartmentList{
        public static void main(String[] args) {
        CollegeDepartmentDetailClass myObj[] = new CollegeDepartmentDetailClass[5];
        // Set the value of College name and Department name
        myObj[0] = new CollegeDepartmentDetailClass();
        myObj[0].setCollegeName("Dayanand Sagar College of Engineering");
        myObj[0].setDepartmentName(new ArrayList<>(List.of("MECH", "EEE", "AERO")));

        myObj[1] = new CollegeDepartmentDetailClass();
        myObj[1].setCollegeName("Jain University");
        myObj[1].setDepartmentName(new ArrayList<>(List.of( "CSE", "IT", "ECE")));

        myObj[2] = new CollegeDepartmentDetailClass();
        myObj[2].setCollegeName("BMS College of Engineering");
        myObj[2].setDepartmentName(new ArrayList<>(List.of( "AUTO", "MECH")));

        myObj[3] = new CollegeDepartmentDetailClass();
        myObj[3].setCollegeName("PES University");
        myObj[3].setDepartmentName(new ArrayList<String>(List.of( "CSE", "IT", "ECE","EI", "MECH")));

        myObj[4] = new CollegeDepartmentDetailClass();
        myObj[4].setCollegeName("R V Institute of Technology");
        myObj[4].setDepartmentName(new ArrayList<>(List.of( "EEE", "ECE", "AERO", "EI")));

        // To get the values of College name and Department name
           for(int i = 0; i < 5 ; i++){
                System.out.println(myObj[i].getCollegeName());
                System.out.println(myObj[i].getDepartmentName());
            }
    }
}

