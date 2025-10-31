public class NonStaticExceutionFlow{
    int x=10;
    {
        System.out.println("Non static block");
    }
    NonStaticExceutionFlow(){
        System.out.println("Constructor");
    }
    public static void main(String[] args){
        System.out.println("MM");
        NonStaticExceutionFlow flow = new NonStaticExceutionFlow();
        System.out.println("MM End");
    }
}