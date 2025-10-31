class Home1{
    Home1(int x){
	System.out.println("Hi");
    }
}
public class House1 extends Home1{
    House1(int x){
	System.out.println("Hello");
    }

    void display(){
	System.out.println("HRU");
    }
    public static void main(String[] args){
	House1 hous= new House1(5);
	hous.display();
    }

}