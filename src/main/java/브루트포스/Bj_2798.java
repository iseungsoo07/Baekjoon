package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        int a = 0, b = 0, c = 0;
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                b = arr[j];
                for (int k = j + 1; k < arr.length; k++) {
                    c = arr[k];
                    if (a + b + c > max && a + b + c <= m) {
                        max = a + b + c;
                    }
                }
            }
        }

        System.out.println(max);

    }
}
