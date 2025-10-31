public class CatchingAllExcep{
    public static void main(String[] args){
	try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("Result : " + c);
	}
	catch(Exception ex){
		System.out.println("Exception is raised");
	}
    }
}
