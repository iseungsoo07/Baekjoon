import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_26008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());

        int[] val = new int[M];
        for (int i = 0; i < M; i++) {
            val[i] = i;
        }

        int[] P = new int[N];

        int result = 0;

        for (int i = 0; i < N; i++) {
            result += P[i] * Math.pow(A, i);
        }

        if (result % M == H) {
            cnt++;
        }

        System.out.println(cnt);

    }
}
