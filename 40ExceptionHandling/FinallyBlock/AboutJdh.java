public class AboutJdh{
    public static void main(String[] args){
	System.out.println("before t/c/f");
	try{
		System.out.println(10/0);
	}
	finally{
		System.out.println("in finally");
	}
	System.out.println("after t/c/f");
    }
}