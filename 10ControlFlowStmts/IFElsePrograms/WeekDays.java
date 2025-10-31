import java.util.Scanner;
public class WeekDays {
	public static void main(String[] args)	
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
		if(num ==1){
	System.out.println(num + " Today is sunday");
		} else if (num==2){
	System.out.println(num + " Today is monday");
		} else if(num==3){
	System.out.println(num + " Today is Tuesday");
		}else if(num==4){
	System.out.println(num + " Today is Wednesday");
		} else if(num==5){
	System.out.println(num + " Today is Thursday");
		} else if(num==6){
	System.out.println(num + " Today is Friday");
		} else if(num==7){
	System.out.println(num + " Today is Saturday");
		}
	else {
	System.out.println(num + " Wrong Number Enter only between (1-7 )");
	}
	}
}