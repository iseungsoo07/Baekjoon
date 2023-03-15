package 문자열;

import java.util.Scanner;

public class Bj_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        String[] num = new String[n];
        int total = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = str.charAt(i) + "";
            total += Integer.parseInt(num[i]);
        }

        System.out.println(total);
    }
}
