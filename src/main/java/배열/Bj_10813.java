package 배열;

import java.util.Scanner;

public class Bj_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] basket = new int[sc.nextInt()];
        int count = sc.nextInt();

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        int i = 0;
        int j = 0;
        int temp = 0;

        for (int c = 0; c < count; c++) {
            i = sc.nextInt();
            j = sc.nextInt();

            temp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = temp;
        }

        for (int k = 0; k < basket.length; k++) {
            System.out.print(basket[k] + " ");
        }
    }
}
