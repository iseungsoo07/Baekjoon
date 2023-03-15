package 문자열;

import java.util.Scanner;

public class Bj_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int i = sc.nextInt();

        System.out.println(str.charAt(i - 1));
    }
}
