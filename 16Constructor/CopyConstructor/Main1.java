public class Main1{
    public static void main(String[] args){
        Test1 test = new Test1(10,20);
        test.display(); 
        System.out.println("=".repeat(50));
        Test1 tes = new Test1(test);
        tes.display();
    }
}