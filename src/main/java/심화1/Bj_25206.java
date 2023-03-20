package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String subject;
        double grade;
        String rate;
        double total = 0.0;
        double gradeTotal = 0.0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            subject = st.nextToken();
            grade = Double.parseDouble(st.nextToken());
            rate = st.nextToken();

            if (!(rate.equals("P"))) {
                gradeTotal += grade;
            }

            if (rate.equals("A+")) {
                total += grade * 4.5;
            } else if (rate.equals("A0")) {
                total += grade * 4.0;
            } else if (rate.equals("B+")) {
                total += grade * 3.5;
            } else if (rate.equals("B0")) {
                total += grade * 3.0;
            } else if (rate.equals("C+")) {
                total += grade * 2.5;
            } else if (rate.equals("C0")) {
                total += grade * 2.0;
            } else if (rate.equals("D+")) {
                total += grade * 1.5;
            } else if (rate.equals("D0")) {
                total += grade;
            } else if (rate.equals("F")) {
                total += grade * 0.0;
            }


        }

        double result = total / gradeTotal;
        System.out.printf("%.6f", result);
    }
}
