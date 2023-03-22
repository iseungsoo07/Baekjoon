package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        if (N == 4 || N == 7) {
            result = -1;
        } else if (N % 5 == 0) {
            result = N / 5;
        } else if (N % 5 == 1 || N % 5 == 3) {
            result = N / 5 + 1;
        } else if (N % 5 == 2 || N % 5 == 4) {
            result = N / 5 + 2;
        }

        System.out.println(result);
    }

}
