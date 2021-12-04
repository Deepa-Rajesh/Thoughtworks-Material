package PolymorphismAssignment;
/* java assignment for Polymorphism
    comparing two numbers and three number using same method name
     */
 class FindingBiggestNumber {
        int num1, num2, num3;

        public void findingLargestNum(int num1, int num2) {
            // comparing two numbers to find the biggest number
            if (num1 > num2) {
                System.out.println("The largest number is: " + num1);
            } else {
                System.out.println("The largest number is: " + num2);
            }
        }
        public void findingLargestNum(int num1, int num2, int num3){
            //comparing three number to find the biggest number
            if (num1 > num2 && num1 > num3)
                System.out.println("The largest number is: "+num1);
            else if (num2 > num1 && num2 > num3)
                System.out.println("The largest number is: "+num2);
            else if (num3 > num1 && num3 > num2)
                System.out.println("The largest number is: "+num3);
            else
                System.out.println("The numbers are same.");
        }
    }

