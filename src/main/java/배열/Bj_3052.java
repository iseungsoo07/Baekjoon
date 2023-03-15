package 배열;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] remain = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            remain[i] = Integer.parseInt(st.nextToken()) % 42;
            for (int j = 0; j < i; j++) {
                if (remain[i] == remain[j]) {
                    count--;
                    break;
                }
            }
            count++;
        }

        System.out.println(count);
    }
}
