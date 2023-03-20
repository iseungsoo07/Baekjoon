package 심화1;

import java.util.Scanner;

public class Bj_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        int[] cnt = new int[26];

        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 65]++;
        }

        int max = -1;
        char ch = 'A';

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                ch = (char) (i + 65);
            } else if (cnt[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
