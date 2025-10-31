public class VariableF{
    final int x;

    VariableF(int x){
	this.x=x;
	System.out.println(x);
    }

    public static void main(String[] args){
	VariableF fin = new VariableF(20);
        VariableF fin2 = new VariableF(30);

    }
}