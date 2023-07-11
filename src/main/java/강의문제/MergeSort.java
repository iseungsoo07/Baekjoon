package 강의문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MergeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int temp_index = start;

        int[] temp = new int[arr.length];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[temp_index++] = arr[i++];
            } else {
                temp[temp_index++] = arr[j++];
            }
        }

        // 앞 부분배열에 원소가 남아있는 경우
        while (i <= mid) {
            temp[temp_index++] = arr[i++];
        }

        // 뒤 부분배열에 원소가 남아있는 경우
        while (j <= end) {
            temp[temp_index++] = arr[j++];
        }

        for (int index = start; index < temp_index; index++) {
            arr[index] = temp[index];
        }
    }
}
