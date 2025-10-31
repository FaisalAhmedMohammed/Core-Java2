public class NoOfObjects{
    static int count=0;
    {
	count++;
    }

    NoOfObjects(){
        System.out.println("NPC");
    }

    NoOfObjects(int n){
	System.out.println("IPC");
    }
     NoOfObjects(String s){
	System.out.println("sPC");
    }
    public static void main(String[] args){
	NoOfObjects ob = new NoOfObjects();
	NoOfObjects ob1 = new NoOfObjects(10);
	NoOfObjects ob2 = new NoOfObjects("Hello");
	System.out.println(count);
    }
   
}