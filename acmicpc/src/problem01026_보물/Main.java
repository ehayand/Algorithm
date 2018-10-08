package problem01026_보물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-10-08
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[2][];
        String[] temp;

        for (int i = 0; i < 2; i++) {
            temp = br.readLine().split(" ");
            array[i] = init(n, temp);
        }

        quickSort(array[0], true, 0, n - 1);
        quickSort(array[1], false, 0, n - 1);

        int ans = 0;

        for (int i = 0; i < n; i++) ans += (array[0][i] * array[1][i]);

        System.out.println(ans);
    }

    public static int[] init(int size, String[] temp) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) arr[i] = Integer.parseInt(temp[i]);

        return arr;
    }

    public static void quickSort(final int[] arr, boolean isAscend, int left, int right) {
        int i, j, pivot, temp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[left];

            while (i < j) {
                if (isAscend) {
                    while (i < j && arr[j] > pivot) j--;
                    while (i < j && arr[i] <= pivot) i++;
                } else {
                    while (i < j && arr[j] < pivot) j--;
                    while (i < j && arr[i] >= pivot) i++;
                }

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            temp = arr[i];
            arr[i] = arr[left];
            arr[left] = temp;

            quickSort(arr, isAscend, left, i - 1);
            quickSort(arr, isAscend, i + 1, right);
        }
    }
}
