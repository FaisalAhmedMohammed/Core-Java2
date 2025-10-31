public class InstanceBlock{
    {
        System.out.println("Hello");
    }
    InstanceBlock(){
        System.out.println("NPM");
    }
     InstanceBlock(int a){
        System.out.println("IPM");
    }
     InstanceBlock(String str){
        System.out.println("SPM");
    }
    public static void main(String [] args){

        InstanceBlock logic1 = new InstanceBlock();
        InstanceBlock logic2 = new InstanceBlock(10);
        InstanceBlock logic3 = new InstanceBlock("Hari");
    }
}