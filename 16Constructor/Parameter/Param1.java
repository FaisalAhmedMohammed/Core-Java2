public class Param1{
    int x;
    int y;
    Param1(){
        System.out.println("No Param ");
         x=10;
         y=20;
    }
    Param1(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}