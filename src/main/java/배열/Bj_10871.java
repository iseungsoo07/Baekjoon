package 배열;

import java.util.Scanner;

public class Bj_10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num;

        int n = sc.nextInt();
        int x = sc.nextInt();
        num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] < x) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
