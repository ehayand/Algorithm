package problem02357_최소값과_최대값;

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
    static final int MIN_VALUE = 0;
    static int[] minSegment, maxSegment;
    static int size = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int queryL, queryR, min, max;
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        while (n << 1 > size) size <<= 1;


        minSegment = new int[size];
        maxSegment = new int[size];
        size >>= 1;

        for (int i = size; i < size << 1; i++) minSegment[i] = MAX_VALUE;

        for (int i = 0; i < n; i++) minSegment[size + i] = maxSegment[size + i] = Integer.parseInt(br.readLine());

        minSegment(1);
        maxSegment(1);

        for (int i = 0; i < m; i++) {
            temp = br.readLine().split(" ");
            queryL = Integer.parseInt(temp[0]);
            queryR = Integer.parseInt(temp[1]);
            min = minQuery(queryL, queryR, 1, 1, size);
            max = maxQuery(queryL, queryR, 1, 1, size);
            sb.append(min + " " + max + "\n");
        }

        System.out.print(sb.toString());
    }

    public static int minSegment(int nodeIndex) {
        if (nodeIndex >= size) return minSegment[nodeIndex];
        int A = minSegment(nodeIndex << 1);
        int B = minSegment((nodeIndex << 1) + 1);
        minSegment[nodeIndex] = A > B ? B : A;
        return minSegment[nodeIndex];
    }

    public static int maxSegment(int nodeIndex) {
        if (nodeIndex >= size) return maxSegment[nodeIndex];
        int A = maxSegment(nodeIndex << 1);
        int B = maxSegment((nodeIndex << 1) + 1);
        maxSegment[nodeIndex] = A > B ? A : B;
        return maxSegment[nodeIndex];
    }

    public static int minQuery(int queryL, int queryR, int nodeIndex, int nodeL, int nodeR) {
        if (queryR < nodeL || nodeR < queryL) return MAX_VALUE;
        if (queryL <= nodeL && nodeR <= queryR) return minSegment[nodeIndex];
        int mid = (nodeL + nodeR) >> 1;

        int A = minQuery(queryL, queryR, nodeIndex << 1, nodeL, mid);
        int B = minQuery(queryL, queryR, (nodeIndex << 1) + 1, mid + 1, nodeR);
        return A > B ? B : A;
    }

    public static int maxQuery(int queryL, int queryR, int nodeIndex, int nodeL, int nodeR) {
        if (queryR < nodeL || nodeR < queryL) return MIN_VALUE;
        if (queryL <= nodeL && nodeR <= queryR) return maxSegment[nodeIndex];
        int mid = (nodeL + nodeR) >> 1;

        int A = maxQuery(queryL, queryR, nodeIndex << 1, nodeL, mid);
        int B = maxQuery(queryL, queryR, (nodeIndex << 1) + 1, mid + 1, nodeR);
        return A > B ? A : B;
    }
}
