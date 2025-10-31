public class ModifyNSV {
    int x=10;
    void m1(){
        System.out.println(x);
        x=20;
    }
    public static void main(String[] args){
        ModifyNSV md = new ModifyNSV();
        md.x=50;
        md.m1();
        System.out.println(md.x);
    }
}