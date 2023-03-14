package 배열;

import java.util.Scanner;

public class Bj_10810 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] basket = new int[sc.nextInt()];
        int count = sc.nextInt();

        int i = 0;
        int j = 0;
        int k = 0;

        for (int v = 0; v < count; v++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();

            for (int c = i - 1; c < j; c++) {
                basket[c] = k;
            }
        }

        for (int b : basket) {
            System.out.print(b + " ");
        }
    }
}
