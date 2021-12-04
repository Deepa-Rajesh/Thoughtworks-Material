import java.util.Scanner;
/* java Day2
Assignment 2
Program to arrange given number in ascending order
 */
public class Ascendingnumber {
    public static void main(String[] args) {
        String strvalue;
        System.out.println("Enter any number you want to arrange in ascending order");
        Scanner sc = new Scanner(System.in);
        strvalue = sc.nextLine();
        int len = strvalue.length();
        char c[] = new char[len];

// copying the string characters into a char array
        strvalue.getChars(0, len, c, 0);
// calling a method to arrange the numbers
        arrangeAscending(c);
        System.out.print("Arranged -> ");
        System.out.println(new String(c));
    }

// method to check each digit and change it's position according to ascending order
    public static void arrangeAscending(char value[]) {

        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                char curr = value[i];

                char next = value[j];
                if (curr > next) {
                    value[i] = next;
                    value[j] = curr;
                }
            }
        }

    }
}

