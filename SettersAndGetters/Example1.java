public class Example1{
    int x;
    int y;

    Example1(){
        x=10;
        y=20;
    }
    Example1(int x, int y){
        this.x=x;
        this.y=y;
    }
    Example1(Example1 e){
        this.x=e.x;
        this.y=e.y;

   }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int gety(){
       return y;
    } 
    void display(){
        System.out.println(" x : "+ x);
        System.out.println(" y : "+ y);
    }
}