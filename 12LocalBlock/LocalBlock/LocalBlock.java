public class LocalBlock {
    public static void main(String[] args) {
        int p = 20;
        {
            int q = 30;
            System.out.println("Inside LocalBlock " + q);
        }
	//System.out.println("Inside LocalBlock " + q);
        System.out.println("Outside LocalBlock " + p);
    }
}
