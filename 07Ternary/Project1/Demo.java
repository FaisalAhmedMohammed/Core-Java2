public class Demo {

  static class Show {
	static void m1(){
	System.out.println("This is private class method");
	}
	}
	public static void main(String[] args) {
 	Demo d1 = new Demo();
	Show.m1();
	}

}