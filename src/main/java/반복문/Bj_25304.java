package 반복문;

import java.util.Scanner;

public class Bj_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long receiptTotal = sc.nextLong();
        int count = sc.nextInt();

        int a = 0;
        int b = 0;
        long total = 0;

        for (int i = 0; i < count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            total += a * b;
        }

        if (receiptTotal == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
