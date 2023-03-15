package 배열;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] stu = new int[30];

        for (int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            stu[Integer.parseInt(st.nextToken()) - 1] = 1;
        }

        for (int i = 0; i < stu.length; i++) {
            if (stu[i] == 0) {
                bw.write(i + 1 + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
