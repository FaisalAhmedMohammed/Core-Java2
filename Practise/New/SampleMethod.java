public class SampleMethod{
   void m1(){
        System.out.println("inside method");
         m1();
    }
    public static void main(String[] args){
    System.out.println("start");
     SampleMethod sm = new SampleMethod();
      sm.m1();
    
    }
}