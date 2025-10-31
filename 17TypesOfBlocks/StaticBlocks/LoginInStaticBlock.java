public class LoginInStaticBlock {
    static {
        int a = 10;
        System.out.println(a);

        String str = new String("Hari");
        System.out.println(str);

        if (true) {
            System.out.println("If Condition");
        }

        switch (5) {
            // No case or default provided — still valid syntax
        }

        int b = 0; // 🔴 You must declare 'b' before using it
        while (b < 20) {
            System.out.println(b);
            b++;
            break; // Only one iteration due to break
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
