package 문자열;

import java.io.*;

public class Bj_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String dial = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int time = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = dial.indexOf(s.charAt(i));
            if (index >= 0 && index < 3) {
                time += 3;
            } else if (index >= 3 && index < 6) {
                time += 4;
            } else if (index >= 6 && index < 9) {
                time += 5;
            } else if (index >= 9 && index < 12) {
                time += 6;
            } else if (index >= 12 && index < 15) {
                time += 7;
            } else if (index >= 15 && index < 19) {
                time += 8;
            } else if (index >= 19 && index < 22) {
                time += 9;
            } else if (index >= 22) {
                time += 10;
            }
        }

        bw.write(time + "");
        br.close();
        bw.flush();
        bw.close();

    }
}
