import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Dayofmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num;
        num = sc.nextInt();
        if (num > 30) {
            System.out.println("enter a valid number");
        } else if (num % 7 == 1) {
            System.out.println("monday");
        } else if (num % 7 == 2) {
            System.out.println("Tuesday");
        } else if (num % 7 == 3) {
            System.out.println("Wednesday");
        } else if (num % 7 == 4) {
            System.out.println("Thursday");
        } else if (num % 7 == 5) {
            System.out.println("Friday");
        } else if (num % 7 == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("sunday");
        }
    }
}