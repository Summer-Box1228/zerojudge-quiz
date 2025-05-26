import java.util.Scanner;

public class A007 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while(scn.hasNext()) {
            int i = scn.nextInt();
            int sq = (int) Math.sqrt(i);
            for (int n = sq; n > 1; n--) {
                if (i % n == 0) System.out.print("非質數"); break;
            }
        }
    }
}
