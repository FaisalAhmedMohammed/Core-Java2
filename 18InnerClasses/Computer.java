public class Computer{
    Computer(){
        System.out.println("Outer Constructor");
    }
    class Mouse{
        Mouse(){
            System.out.println("Inner Constructor");
        }
    }
    public static void main(String[] args){
    Computer co = new Computer();
    Mouse mo = co.new Mouse();
    }
   
}