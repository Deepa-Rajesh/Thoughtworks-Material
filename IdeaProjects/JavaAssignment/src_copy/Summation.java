import java.sql.SQLOutput;

public class Summation {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        //switch(case){
           // case(1):
        /*          while( i < 100){
                     sum = i+(i+1);
                      i++;
        }
       for (int i = 1; i < 100; i++){
            sum = i+(i+1);
        } */

            do {
                sum = i + (i + 1);
                i++;

            } while (i < 100);
            System.out.println(sum);
        }
    }



