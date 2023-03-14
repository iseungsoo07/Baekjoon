package 입출력과_사칙연산;

import java.util.Scanner;

public class Bj_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int보다 큰 수가 들어올 수 있기 때문에 long 타입을 사용해야 정답처리가 되는 문제
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a + b + c);
    }
}
