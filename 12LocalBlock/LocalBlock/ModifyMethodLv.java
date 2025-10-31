public class ModifyMethodLv{
    static void m1(){
        int p=10;
        {
            System.out.println("MethodLevel LV :" + p);
            p=50;
            int q=20;
	    System.out.println("BlockLevel Lv :"+q); 
        }
            System.out.println("MethodLevel LV :" + p);
    }
    public static void main(String[] args){
        m1();
    }
}