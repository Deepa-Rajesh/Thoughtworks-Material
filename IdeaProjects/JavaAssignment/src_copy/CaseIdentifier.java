
import java.util.Scanner;
/*  Java Day 1
    Assignment 2
    Program to identify whether a given character is Uppercase or LowerCase */
public class CaseIdentifier {
    public static void main(String[] args) {
        char in_char;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        in_char = sc.next().charAt(0);
        // checking based on ASCII value
        if(in_char >= 97 && in_char <=123){
            System.out.println("Lower Case");
        }else if(in_char >= 48 && in_char<=96){
            System.out.println("Upper Case");
        }
    }
}
