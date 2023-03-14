package 반복문;

import java.util.Scanner;

public class Bj_2739 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
        }
    }
}
