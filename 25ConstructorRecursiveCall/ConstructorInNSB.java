public class ConstructorInNSB{
    {
        System.out.println("NSB");
	ConstructorInNSB ns = new ConstructorInNSB();
    }
    public static void main(String[] args){
	System.out.println("MM");
	ConstructorInNSB n = new ConstructorInNSB();
    }
}