package 강의문제;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] S = new long[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            bw.write(S[j] - S[i - 1] + "\n");
        }

        bw.flush();
    }
}
