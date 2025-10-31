public class Room{
    private int l;
    private int b;
    
    public void setL(int l){
        this.l=l;
    }
    public int getL(){
        return l;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getB(){
        return b;
    }

    void findArea(){
        System.out.println("Area is : "+ l * b);
    }
    void findPerimeret(){
        System.out.println("Perimeter is : " + (2* (l + b)));
    }
    void display(){
        System.out.println("1: " + l);
        System.out.println("b: " + b);
    }
}