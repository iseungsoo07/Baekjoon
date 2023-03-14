package 반복문;

import java.util.Scanner;

public class Bj_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tcNum = sc.nextInt();
        int[] sum = new int[tcNum];

        int a = 0, b = 0;

        for (int i = 0; i < tcNum; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            sum[i] = a + b;
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + sum[i]);
        }
    }
}