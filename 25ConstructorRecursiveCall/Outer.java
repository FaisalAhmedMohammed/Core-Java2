public class Outer{
    private class Inner{
        void m1(){
            System.out.println("M1() method");
        }
    }
    void display(){
        Inner in = new Inner();
        in.m1();
    }
    public static void main(String[] args){
        Outer ou = new Outer();
        ou.display();
    }
}