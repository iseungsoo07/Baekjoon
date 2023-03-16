package 문자열;

import java.io.*;

public class Bj_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        String[] arr = st.trim().split(" ");
        int count = 0;

        for (String s : arr) {
            if(!s.equals("")) {
                count++;
            }
        }

        // bw.write() 메소드는 문자열을 출력하기 때문에 정수를 파라미터로 받으면 출력이 되지 않는다.
        // 따라서 문자열로 형 변환 해줘야 함.
        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
