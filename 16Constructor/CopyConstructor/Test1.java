public class Test1{
    int x;
    int y;
    Test1(int x,int y){
        this.x=x;
        this.y=y;
    }
    Test1(Test1 t){
        this.x=t.x;
        this.y=t.y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}