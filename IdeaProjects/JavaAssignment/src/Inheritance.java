import java.util.Scanner;

public class Inheritance {
    int room ;
    public void no_Of_Light(int room){
        int no_Oflight = room * 3;
        System.out.println("Number of total light in home" + no_Oflight);
    }
}

class Home extends Inheritance{
    public static void main(String[] args) {
        int rooms;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rooms in your house");
        rooms = sc.nextInt();
        Home myhome = new Home();
        myhome.no_Of_Light(rooms);
    }



    }
