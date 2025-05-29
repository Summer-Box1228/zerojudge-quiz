import java.util.Scanner;
import java.util.Collection.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int line = scn.nextInt();
        char[] classes = {A,E,H,I,L,M,O,S,T};
        StringBuilder sb = new StringBuilder();
        String[][] os = new String[line][3];
        Map<Character, String> sm = new TreeMap<>();
        for (int i = 0; i < line; i++) {
            String s = scn.next();
            String n = s.charAt(0) + "";
            String tmps = s.charAt(s.length() - 1) + "";
            String[] tmp = {n, tmps, scn.next()};
            os[i] = tmp;
        }
        for (String[] s : os[]){
            String cal = s[1];
            String grade = s[0];
            switch (cal) {
                case "A" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "E" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "H" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "I" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "L" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "M" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "O" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "S" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
                case "T" : {
                    switch (grade) {
                        case "4" : {
                            break;
                        }
                        case "6" : {
                            break;
                        }
                        case "8" : {
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }
}
