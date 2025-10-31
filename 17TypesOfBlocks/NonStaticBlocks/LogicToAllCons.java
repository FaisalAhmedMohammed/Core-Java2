public class LogicToAllCons{
    LogicToAllCons(){
        System.out.println("Hello");
    }
    LogicToAllCons(int a){
        System.out.println("Hello");
    }
    LogicToAllCons(String str){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        LogicToAllCons logic1 = new LogicToAllCons();
        LogicToAllCons logic2 = new LogicToAllCons(10);
        LogicToAllCons logic3 = new LogicToAllCons("Hari");
    }
}