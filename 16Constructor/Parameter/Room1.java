public class Room1{
    private double l;
    private double b;

    Room1(double l,double b){
        this.l=l;
        this.b=b;
    }
    public void setL(double l){
        this.l=l;
    }
    public double getL(){
        return this.l;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return this.b;
    }
    double findArea(){
        return l*b;
    }
    void findPerimeter(){
        double result=(2*(l+b));
        System.out.println(result);
    }
    void display(){
    System.out.println(l);
    System.out.println(b);
    }
}