public class sample{
    sample(){
        System.out.println("Constructor");
        sample sam = new sample();
    }
    public static void main(String[] args){ 
        System.out.println("MM Start");
        sample s1= new sample();
        System.out.println("MM end");
    }
}