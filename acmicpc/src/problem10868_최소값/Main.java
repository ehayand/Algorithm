package problem10868_최소값;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-07-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Main {

    static final int MAX_VALUE = 1000000001;
    static int[] minSegment;
    static int size = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int queryL, queryR, ans;
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        while (n << 1 > size) size <<= 1;

        minSegment = new int[size];
        size >>= 1;

        for (int i = size; i < size << 1; i++) minSegment[i] = MAX_VALUE;

        for (int i = 0; i < n; i++) minSegment[size + i] = Integer.parseInt(br.readLine());

        segmentFill(1);

        for (int i = 0; i < m; i++) {
            temp = br.readLine().split(" ");
            queryL = Integer.parseInt(temp[0]);
            queryR = Integer.parseInt(temp[1]);
            ans = minQuery(queryL, queryR, 1, 1, size);
            sb.append(ans + "\n");
        }

        System.out.print(sb.toString());
    }

    public static int segmentFill(int nodeIndex) {
        if (nodeIndex >= size) return minSegment[nodeIndex];
        int A = segmentFill(nodeIndex << 1);
        int B = segmentFill((nodeIndex << 1) + 1);
        minSegment[nodeIndex] = A > B ? B : A;
        return minSegment[nodeIndex];
    }

    public static int minQuery(int queryL, int queryR, int nodeIndex, int nodeL, int nodeR) {
        if (queryR < nodeL || nodeR < queryL) return MAX_VALUE;
        if (queryL <= nodeL && nodeR <= queryR) return minSegment[nodeIndex];
        int mid = (nodeL + nodeR) >> 1;

        int A = minQuery(queryL, queryR, nodeIndex << 1, nodeL, mid);
        int B = minQuery(queryL, queryR, (nodeIndex << 1) + 1, mid + 1, nodeR);
        return A > B ? B : A;
    }
}