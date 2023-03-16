package 심화1;

import java.util.Scanner;

public class Bj_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = i; k < 3 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i < 2 * n - 1; i++) {
            for (int j = n - 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < -2 * i + 4 * n - 3; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
