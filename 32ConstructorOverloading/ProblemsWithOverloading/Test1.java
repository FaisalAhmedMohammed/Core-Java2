public class Test1 {
    public static void main(String[] args) {
        ConsOVer over = new ConsOVer();
	System.out.println(over);

        System.out.println("*".repeat(60));

        ConsOVer over1 = new ConsOVer(1234567);
	System.out.println(over1);

        System.out.println("*".repeat(60));

        ConsOVer over3 = new ConsOVer(2345, "Hari");
	System.out.println(over3);

        System.out.println("*".repeat(60));

        ConsOVer over4 = new ConsOVer(23456, "Hari", 50000);
	System.out.println(over4);
    }
}
