import java.util.Arrays;
import java.util.Scanner;

public class E287 {
    public static Scanner scn = new Scanner(System.in);
    public static final int n = scn.nextInt(), m = scn.nextInt();
    public static int[][] is = new int[n][m], is2 = new int[n][m];
    public static int[] round = new int[4];
    public static int min, posX, posY;
    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < m; i1++) {
                int num = scn.nextInt();
                is[i][i1] = num;
                if (i1 != 0 && num < is[i][i1 - 1]) {
                    min = num;
                    posX = i;
                    posY = i1;
                } else if (i != 0 && num < is[i - 1][m - 1]) {
                    min = num;
                    posX = i;
                    posY = i1;
                } else if (i == 0 && i1 == 0) {
                    min = num;
                    posX = i;
                    posY = i1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            Arrays.fill(is2[n], 0);
        }
        for (int i = 0; i < n * m; i++) {

        }
    }
}
