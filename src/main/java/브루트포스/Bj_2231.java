package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int constructor = i;

            while (constructor != 0) {
                sum += constructor % 10;
                constructor /= 10;
            }

            if (sum + i == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
