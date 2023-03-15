package 문자열;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            sb.append(s.charAt(0)).append(s.charAt(s.length() - 1)).append("\n");
        }

        br.close();
        System.out.println(sb.toString());
    }
}