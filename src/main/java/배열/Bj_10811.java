package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            for (int k = x; k <= y; k++, y--) {
                int temp = array[k];
                array[k] = array[y];
                array[y] = temp;
            }
        }

        for (int z = 0; z < array.length; z++)
            System.out.print(array[z] + " ");

        br.close();
    }
}