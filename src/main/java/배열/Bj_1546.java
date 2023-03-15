package 배열;

import java.util.Scanner;

public class Bj_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        int max = score[0];

        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }

        double avg;
        double total = 0.0;

        for (int i = 0; i < score.length; i++) {
            total += (double) score[i] / (double) max * 100;
        }
        avg = total / n;
        System.out.println(avg);
    }
}
