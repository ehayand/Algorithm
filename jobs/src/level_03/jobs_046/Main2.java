package level_03.jobs_046;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2019-02-07
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[8][8];

        int kingRow = 0;
        int kingCol = 0;

        String[] temp;
        for (int i = 0; i < 8; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < 8; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
                if (arr[i][j] == 1) {
                    kingRow = i;
                    kingCol = j;
                }
            }
        }

        System.out.println(check(arr, kingRow, kingCol) ? 1 : 0);
    }

    public static boolean check(final int[][] arr, int kingRow, int kingCol) {

        if (kingRow < 7) {
            for (int i = kingRow + 1; i < 8; i++) {
                if (arr[i][kingCol] == 2) return true;
                else if (arr[i][kingCol] == 3) break;
            }
        }

        if (kingRow > 0) {
            for (int i = kingRow - 1; i >= 0; i--) {
                if (arr[i][kingCol] == 2) return true;
                else if (arr[i][kingCol] == 3) break;
            }
        }

        if (kingCol < 7) {
            for (int i = kingCol + 1; i < 8; i++) {
                if (arr[kingRow][i] == 2) return true;
                else if (arr[kingRow][i] == 3) break;
            }
        }

        if (kingCol > 0) {
            for (int i = kingCol - 1; i > 0; i--) {
                if (arr[kingRow][i] == 2) return true;
                else if (arr[kingRow][i] == 3) break;
            }
        }

        return false;
    }
}
