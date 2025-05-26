import java.util.Scanner;

public class D784 {
    public static Scanner scn = new Scanner(System.in);
    public static final int line = scn.nextInt();
    public static void main(String[] args) {
        for (int i1 = 0; i1 < line; i1++) {
            int n = scn.nextInt();
            int[] is = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                is[i] = scn.nextInt();
                sum += is[i];
            }
            for (int i = 0; i < n; i++) {
                if (sum > sum - is[i]) break;
                else sum -= is[i];
            }
            for (int i = n - 1; i >= 0; i--) {
                if (sum > sum - is[i]) break;
                else sum -= is[i];
            }
            System.out.println(sum);
        }
    }
}
