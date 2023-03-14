package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class Bj_15552 {
    public static void main(String[] args) throws IOException {
        // BufferedReader, BufferedWriter를 사용하면 Scanner와 System.out.println을 사용했을 때 보다 효율적이고 빠르다.
        // 해당 기능을 사용할 때는 try catch를 이용해 예외를 잡던가 IOException을 던져줘야한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        // readLine 메소드는 항상 String 형을 반환하기 때문에 다른 형태로 사용하기 위해서는 형 변환이 필요하다.
        int tcNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < tcNum; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
