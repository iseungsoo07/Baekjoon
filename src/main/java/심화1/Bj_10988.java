package 심화1;

import java.io.*;

public class Bj_10988 {

    public static int isPalindrome() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        sb.append(s);

        br.close();
        if (sb.toString().equals(sb.reverse().toString())) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(isPalindrome() + "");
        bw.flush();
        bw.close();
    }
}
