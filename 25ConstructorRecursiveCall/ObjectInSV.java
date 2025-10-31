public class ObjectInSV{
    static ObjectInSV  a = new ObjectInSV();

    static{
        System.out.println("SB");
    }
    ObjectInSV(){
	System.out.println("NPC");
    }
    public static void main(String[] args){
	System.out.println("MM");
    }
}