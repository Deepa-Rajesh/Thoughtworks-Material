import java.util.Scanner;
/* Java Day1
Assignment 1
Program to find smallest number among given number by user */

public class Smallnum {
    public static void main(String[] args) {
        int num1, num2,num3,num4, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 integer values");
        // taking input from user
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        min = num1;
        // comparing number with each other to get smallest number
            if ((num1<=num2)&&(num1<=num3)&&(num1<=num4)){
                min=num1;
            }else if((num2<=num3)&&(num2<=num4)){
                min=num2;
            }else if(num3<=num4) {
                min=num3;
            }else {
                min=num4;
            }
            System.out.println("The smallest number is "+ min);
        }

    }

