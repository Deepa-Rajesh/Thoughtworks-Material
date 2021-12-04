package InheritanceAssignment;

import java.util.Scanner;

// child class
 public class Rooms extends Home{
    public static void main(String[] args) {
        int get_No_Rooms;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rooms in your house :");
        get_No_Rooms= sc.nextInt();
       Rooms room = new Rooms();
       room.no_Of_Light(get_No_Rooms);
    }
}
