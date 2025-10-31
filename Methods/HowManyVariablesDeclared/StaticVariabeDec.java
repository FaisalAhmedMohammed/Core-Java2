public class StaticVariableDec {

    int x = 10;
    int y = 20;

    static int m1() {
        return 25;
    }

    public static void main(String[] args) {
        int p = 30;
        int q = 40;

        String s1 = "ahmed";
        String s2 = new String("ashok");

        m1(); // call without storing result
        int r = m1(); // call and store result
        System.out.println(r);
    }
}
