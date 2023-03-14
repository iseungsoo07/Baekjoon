package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        String str = null;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);

            String firstToken = st.nextToken();
            String secondToken = st.nextToken();

            if (firstToken.equals("0") && secondToken.equals("0")) break;

            bw.write(Integer.parseInt(firstToken) + Integer.parseInt(secondToken) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
