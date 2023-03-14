package 반복문;

import java.util.Scanner;

public class Bj_10950 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tcNum = sc.nextInt();
        int[] sum = new int[tcNum];

        for (int i = 0; i < tcNum; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum[i] = a + b;
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}

