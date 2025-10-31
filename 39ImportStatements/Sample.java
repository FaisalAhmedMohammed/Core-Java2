package p2;
import p1.*;
public class Sample{
    static void show(){
	Example.m1();
	System.out.println("show()");
    }
    void display(){
	
	System.out.println("display()");
    }
    public static void main(String[] args){
	Sample.show();
    }
}