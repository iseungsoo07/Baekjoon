package 강의문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 투포인터
 * 교재 문제 6번
 */
public class Bj_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;

        while (end_idx != N) {
            if (sum == N) {
                count++;
                end_idx++;
                sum = sum + end_idx;
            } else if (sum > N) {
                sum = sum - start_idx;
                start_idx++;
            } else {
                end_idx++;
                sum = sum + end_idx;
            }
        }

        System.out.println(count);
    }
}
