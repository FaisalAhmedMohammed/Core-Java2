public class FindEvenOrOdd {

    static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("The given number " + num + " is Even");
        } else {
            System.out.println("The given number " + num + " is Odd");
        }
    }

    public static void main(String[] args) {
        evenOdd(10);
    }
}
