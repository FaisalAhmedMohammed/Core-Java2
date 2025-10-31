public class test {
    static int add(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Dont pass -ve numbers");
        } else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        try {
            int res = add(10, -4);
            System.out.println(res);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}