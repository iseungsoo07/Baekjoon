package 조건문;

import java.util.Scanner;

public class Bj_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute < 45) {
            hour -= 1;

            if (hour < 0) {
                hour = hour + 24;
            }

            minute = minute + 15;
        } else {
            minute = minute - 45;
        }

        System.out.println(hour + " " + minute);

    }
}
