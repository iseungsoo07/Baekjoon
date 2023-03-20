package 심화1;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            int count = 0;
            double total = 0.0;
            double avg = 0.0;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] score = new int[n];

            for (int j = 0; j < score.length; j++) {
                score[j] = Integer.parseInt(st.nextToken());
                total += score[j];
            }

            avg = total / n;

            for (int j = 0; j < score.length; j++) {
                if (score[j] > avg) {
                    count++;
                }
            }
            bw.write(String.format("%.3f", (double) count / n * 100) + "%\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
