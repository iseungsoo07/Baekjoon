package 강의문제;

import java.util.Scanner;

public class Bj_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int A[] = new int[str.length()];


        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }


        for (int i = 0; i < str.length(); i++) {
            int max = i;
            for (int j = i + 1; j < str.length(); j++) {
                if (A[j] > A[max]) {
                    max = j;
                }
            }
            if(A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }

        for (int i : A) {
            System.out.print(i);
        }
    }
}
