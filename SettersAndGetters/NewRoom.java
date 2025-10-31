public class NewRoom{
    private double l;
    private double b;

    NewRoom(double l, double b){
        this.l=l;
        this.b=b;
    } 
    public void setL(double l){
        this.l=l;
    }   
    public double getL(){
        return l;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }

    public void findArea(){
        System.out.println("Area is : "+ l * b);
    }
   public void findPerimeter() {
    System.out.println("Perimeter is : " + (2 * (l + b)));
}

    void display(){
        System.out.println("l is :" + l);
        System.out.println("b is :" + b);
    }
}