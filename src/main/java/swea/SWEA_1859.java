package swea;

import java.util.Scanner;

public class SWEA_1859 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        StringBuilder sb = new StringBuilder();


        for (int test_case = 1; test_case <= T; test_case++) {
            int result = 0;
            int num = sc.nextInt();
            int[] arr = new int[num];
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    result -= arr[i];
                    count++;
                } else {
                    if (result != 0) {
                        result += arr[i] * count;
                        count = 0;
                    }
                }
            }

            if (count != 0) {
                result += arr[arr.length - 1] * count;
            }

            sb.append("#").append(test_case).append(" ").append(result).append("\n");
        }

        System.out.println(sb);
    }
}
