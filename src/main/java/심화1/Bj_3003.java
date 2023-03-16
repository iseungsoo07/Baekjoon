package 심화1;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] chess = {1, 1, 2, 2, 2, 8};
        int i = 0;

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            chess[i] = chess[i] - Integer.parseInt(st.nextToken());
            i ++;
        }

        for (int res : chess) {
            bw.write(res + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
