import java.util.Arrays;
import java.util.Scanner;

public class C782 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt(), k = scn.nextInt();
            //String poss; String wii;
            //String[] posss, wiii;
            int[] pos = new int[n], wi = new int[n];
            long sum = 0L;
            //poss = scn.nextLine();
            //posss = poss.split(" ");
            //wii = scn.nextLine();
            //wiii = wii.split(" ");
            for (int j = 0; j < n; j++) {
                pos[j] = scn.nextInt();
            }
            for (int j = 0; j < n; j++) {
                wi[j] = scn.nextInt();
            }
            for (int j = 0; j < n; j++) {
                int res;
                res = Arrays.binarySearch(pos, pos[j] + k +1);
                if (res < 0) continue;
                else {
                    sum += (long) Arrays.stream(wi).skip(res).sum() * wi[j];
                }
                /*for (int l = j; l < n; l++) {
                    if (pos[l] - pos[j] > k) {
                        break;
                    }
                }*/
            }
            System.out.println(sum);
        }
    }
}
