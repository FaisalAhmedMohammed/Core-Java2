public class CountNoOfObjects{
    private static int Count =0;
    {
        Count++;
        System.out.println(Count);
    }
    CountNoOfObjects(){
        System.out.println("NPM");
        
    }
 CountNoOfObjects(int a){
        System.out.println("IPM");
        
    }
 CountNoOfObjects(String str){
        System.out.println("SPM");
      
    }
    
    public static void main(String[] args){
        CountNoOfObjects logic1 = new CountNoOfObjects();
        CountNoOfObjects logic2 = new CountNoOfObjects(10);
        CountNoOfObjects logic3 = new CountNoOfObjects("Hello");
    }
}