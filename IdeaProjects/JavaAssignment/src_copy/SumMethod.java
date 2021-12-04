import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        int num1, num2;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        num1 = sc.nextInt();
        System.out.println("enter second number ");
        num2 = sc.nextInt();
        int num3 = 10;
        addtwonum(num1,num2);
        addtwonum(num1,num2,num3);
    }

    static void addtwonum(int num1, int num2){
       int  sum = 0;
        sum = num1 + num2;
        System.out.println("sum of num " + sum);
    }
    static void addtwonum(int num1, int num2, int num3){
        int  sum = 0;
        sum = num1 + num2 + num3;
        System.out.println("sum of num " + sum);
    }
}