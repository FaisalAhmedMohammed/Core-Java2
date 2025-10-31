public class NoParam{
    NoParam(){
        System.out.println("No Param");
        int p=10;
        int q=20;
        System.out.println(p);
        System.out.println(q);
    } 
    public static void main(String[] arga){
        NoParam param = new NoParam();
    }  
} 