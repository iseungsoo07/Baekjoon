package 반복문;

import java.util.Scanner;

public class Bj_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tcNum = sc.nextInt();
        String[] str = new String[tcNum];

        int a = 0, b = 0;

        for (int i = 0; i < tcNum; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            str[i] = "Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
