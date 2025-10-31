public class Flow{
    int a=10;
    {
        System.out.println("SNB1");
    }
    Flow(){
        System.out.println("NPM");
    }
    Flow(int a){
        this.a=a;
    }
    int b=20;
    {
        System.out.println("SNB2"); 
    }
    {
        System.out.println("SNB3"); 
    }
    public static void main(String[] args){
        Flow flow =  new Flow();
        //Flow f = new Flow(10);
    }
}