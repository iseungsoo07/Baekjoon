package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String[] board = new String[row];

        for (int i = 0; i < row; i++) {
            board[i] = br.readLine();
        }

        int result = 64;

        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                int current = getSolution(i, j, board);

                if (result > current) {
                    result = current;
                }
            }
        }

        System.out.println(result);

    }

    private static int getSolution(int startRow, int startCol, String[] board) {
        String[] originalBoard = {"WBWBWBWB", "BWBWBWBW"};
        int whiteCount = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;

                if (board[row].charAt(col) != originalBoard[row % 2].charAt(j)) {
                    whiteCount++;
                }
            }
        }

        return Math.min(whiteCount, 64 - whiteCount);
    }
}