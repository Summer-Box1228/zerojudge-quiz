package cleared;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Long.parseLong;

public class C_DFExpression {
    public static Scanner scn = new Scanner(System.in);
    public static final String dfexs = scn.next();
    public static final int wh = scn.nextInt();
    public static Object object;
    public static int a = 0;
    public static int sum = 0;
    public static int b = wh;
    public static void main(String[] args) {
        boolean[][] img = new boolean[wh][wh];
        for (int i = 0; i < wh; i++) {
            Arrays.fill(img[i], false);
        }
        if (dfexs.charAt(a) == '2') {
            a++;
            object = set();
            get(object);
            System.out.println(sum);
        } else {
            object = parseLong(dfexs.charAt(a) + "");
            System.out.println((long)Math.pow(wh, 2) * (long)object);
        }
    }
    public static Object[] set() {
        Object[] objects = new Object[4];
        for (int i = 0; i < 4; i++) {
            if (dfexs.charAt(a) == '2') {
                a++;
                objects[i] = set();
            } else {
                objects[i] = dfexs.charAt(a);
                a++;
            }
        }
        return objects;
    }
    public static void get(Object object) {
        b /= 2;
        for (int i = 0; i < 4; i++) {
            if (((Object[])(object))[i] instanceof Object[]) {
                get(((Object[])(object))[i]);
                b *= 2;
            } else if ((char)((Object[])(object))[i] == '1') {
                sum += (int)Math.pow(b, 2);
            }
        }
    }
}
