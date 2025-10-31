public class Example1 {
    int x=10;
    int y=30;
    
    void m1(int a, int b){
        x=a;
        y=b;    
    }

    void m2(int x, int y){
        x=x;
        y=y;
    }
 
    void m3(int x, int y){
        this.x=x;
        this.y=y;
    }
}