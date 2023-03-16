package 문자열;

import java.io.*;

public class Bj_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        while ((s = br.readLine()) != null) {
            if (s.equals("")) {
                continue;
            }
            bw.write(s.trim() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
