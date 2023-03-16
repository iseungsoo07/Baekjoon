package 문자열;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        sb.append(st.nextToken());
        sb2.append(st.nextToken());

        String a = sb.reverse().toString();
        String b = sb2.reverse().toString();

        if (Integer.parseInt(a) > Integer.parseInt(b)) {
            bw.write(a);
        } else if (Integer.parseInt(b) > Integer.parseInt(a)) {
            bw.write(b);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
