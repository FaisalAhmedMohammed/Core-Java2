public class Sample{
    private int x;
    Sample(){
	this(10);
	System.out.println("NPM"+ " " + this);
    }
    
    Sample(int x){
	this.x=x;
	System.out.println("IPM" + " " + this);
    }
    
    Sample(String x){
	this(Integer.parseInt(x));
	System.out.println("SPM" +" " + this);
    }

    public void display(){
	System.out.println(this + " x value is : "+ x);
    }

    public static void main(String[] args){
	Sample sam = new Sample();
	sam.display();

     System.out.println("*".repeat(50));

     Sample sample = new Sample("20");
	sample.display(); 

    }
}