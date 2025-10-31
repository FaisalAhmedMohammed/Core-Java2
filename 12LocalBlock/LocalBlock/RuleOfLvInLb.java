public class RuleOfLvInLb {
    static void m1() {
        int p = 5;
        {
            int q = 10;
            System.out.println("LocalVariable inside LB " + p);
            System.out.println("LocalBlock Variable " + p);
        }
    }

    public static void main(String[] args) {
        m1();
    }
}
