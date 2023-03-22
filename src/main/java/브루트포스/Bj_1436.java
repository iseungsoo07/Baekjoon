package 브루트포스;

import java.util.Scanner;

public class Bj_1436 {
    public static void main(String[] args) {

        String str = "666";
        String number = "0";
        String result = null;
        int times = 0;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (true) {
            if (number.contains(str)) {
                result = number;
                times += 1;
            }
            if (times == N) {
                break;
            }

            number = String.valueOf(Integer.parseInt(number) + 1);
        }

        System.out.println(result);
    }
}
