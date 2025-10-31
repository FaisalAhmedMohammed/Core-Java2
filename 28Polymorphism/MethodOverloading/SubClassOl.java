class OverloadSC{
    void display(){
	System.out.println("super class display()");
    }
}

public class SubClassOl extends OverloadSC{
    String display(String s){
	System.out.println("sub class display()");
	return s;
    }

    public static void main(String[] args){
	//SubClassOl sb = new SubClassOl();
	//sb.display("ahmed");

	OverloadSC over = new SubClassOl();
	over.display();
    }
}