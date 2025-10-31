import java.util.Scanner;
public class Building1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter Breadth");
        double b = sc.nextDouble();

    Room1 room = new Room1(l,b);
    System.out.println(room.findArea());
    room.findPerimeter();
    room.display();System.out.println(l);
    
    System.out.println("Enter Modified Value l:");
    room.setL(sc.nextDouble());
    room.display();
    }
}