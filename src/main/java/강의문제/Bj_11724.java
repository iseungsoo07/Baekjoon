package 강의문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj_11724 {

    public static ArrayList<Integer>[] A;
    public static boolean[] visited;

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // Node 개수
        int m = Integer.parseInt(st.nextToken()); // Edge 개수


        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n ; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            A[start].add(end);
            A[end].add(start);

        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }
}