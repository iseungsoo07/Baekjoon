package 강의문제;

import java.io.*;
import java.util.PriorityQueue;

public class Bj_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            // 절댓값이 작은 데이터를 우선
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // 절댓값이 같은 경우 음수 우선
            if (first_abs == second_abs) {
                return o1 > o2 ? 1: -1;
            }

            return first_abs - second_abs;
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (priorityQueue.isEmpty()) {
                    bw.write(0 + "\n");
                }else {
                    bw.write(priorityQueue.poll() + "\n");
                }
            } else {
                priorityQueue.add(request);
            }
        }

        bw.flush();
        br.close();
        br.close();
    }
}
