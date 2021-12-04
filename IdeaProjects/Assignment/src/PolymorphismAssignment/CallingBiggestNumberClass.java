package PolymorphismAssignment;

public class CallingBiggestNumberClass extends FindingBiggestNumber{
        public static void main(String[]args){
            FindingBiggestNumber ps = new FindingBiggestNumber();
            // calling methods with different number of arguments
            ps.findingLargestNum(345,567);
            ps.findingLargestNum(25,56,78);
        }
    }

