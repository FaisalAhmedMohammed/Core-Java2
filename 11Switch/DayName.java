import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day name (e.g., Sun, Mon, Tue):");
        String day = sc.nextLine().toLowerCase();  // convert input to lowercase

        switch(day) {
            case "sun":
                System.out.println("Sunday is day 1");
                break;
            case "mon":
                System.out.println("Monday is day 2");
                break;
            case "tue":
                System.out.println("Tuesday is day 3");
                break;
            case "wed":
                System.out.println("Wednesday is day 4");
                break;
            case "thu":
                System.out.println("Thursday is day 5");
                break;
            case "fri":
                System.out.println("Friday is day 6");
                break;
            case "sat":
                System.out.println("Saturday is day 7");
                break;
            default:
                System.out.println("Please enter a valid day abbreviation (sun, mon, tue, wed, thu, fri, sat)");
        }
    }
}
