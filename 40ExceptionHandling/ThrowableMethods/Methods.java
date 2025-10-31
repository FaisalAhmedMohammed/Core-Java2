public class Methods{
    public static void main(String[] args){
	try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
		System.out.println("Result : "+ c);
	}
	catch(Exception ex){
		ex.printStackTrace();

		System.out.println("*".repeat(50));
		System.out.println(ex.getMessage());

		System.out.println("*".repeat(50));
		System.out.println(ex.toString());

	}
    }
}