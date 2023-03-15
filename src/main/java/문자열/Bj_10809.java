package 문자열;

import java.io.IOException;
import java.util.Scanner;

public class Bj_10809 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //
        // char[] alpha = new char[26];
        // int[] result = new int[26];
        //
        // for (int i = 0; i < alpha.length; i++) {
        //     alpha[i] = (char) (i + 97);
        // }
        //
        // Arrays.fill(result, -1);
        //
        // String str = sc.next();
        //
        // for (int i = 0; i < alpha.length; i++) {
        //     for (int j = 0; j < str.length(); j++) {
        //         if (str.charAt(j) == (alpha[i])) {
        //             if (result[i] == -1) {
        //                 result[i] = j;
        //             }
        //         }
        //     }
        // }
        //
        // for (int res : result) {
        //     bw.write(res + " ");
        // }
        //
        // bw.flush();
        // bw.close();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (char i = 97; i < 123; i++) {
            if(!str.contains(i + "")) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(str.indexOf(i) + " ");
            }
        }
    }
}
