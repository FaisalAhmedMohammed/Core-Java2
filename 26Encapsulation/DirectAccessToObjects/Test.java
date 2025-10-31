class Example{
    int x=10;
    
     void setX(int x){
        this.x=x;
    }
     int getX(){
        return this.x;
    } 
}
public class Test{
    public static void main(String[] args){
        Example ex = new Example();
        System.out.println(ex.x=50);
    }
}