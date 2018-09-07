package problem02042_구간_합_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ehay@naver.com on 2018-07-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Segment {

    static long[] sumSegment;
    static int size = 1;

    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int select, queryL, queryR, index, value;
        long ans;
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        int k = Integer.parseInt(temp[2]);
        int t = m + k;
        while (n << 2 > size) size <<= 1;

        sumSegment = new long[size];
        size >>= 1;

        for (int i = 0; i < n; i++) sumSegment[size + i] = Integer.parseInt(br.readLine());

        segmentFill(1);


        while (t-- > 0) {
            temp = br.readLine().split(" ");
            select = Integer.parseInt(temp[0]);
            if (select == 1) {
                index = Integer.parseInt(temp[1]) - 1;
                value = Integer.parseInt(temp[2]);
                index += size;
                sumSegment[index] = value;
                init(index);
                subSegmentFill(1);
            } else {
                queryL = Integer.parseInt(temp[1]);
                queryR = Integer.parseInt(temp[2]);
                ans = sumQuery(queryL, queryR, 1, 1, size);
                sb.append(ans + "\n");
            }
        }

        System.out.print(sb.toString());
    }

    public static long segmentFill(int nodeIndex) {
        if (nodeIndex >= size) return sumSegment[nodeIndex];
        sumSegment[nodeIndex] = segmentFill(nodeIndex << 1) + segmentFill((nodeIndex << 1) + 1);
        return sumSegment[nodeIndex];
    }

    public static long subSegmentFill(int nodeIndex) {
        if (sumSegment[nodeIndex] != -1) return sumSegment[nodeIndex];
        sumSegment[nodeIndex] = subSegmentFill(nodeIndex << 1) + subSegmentFill((nodeIndex << 1) + 1);
        return sumSegment[nodeIndex];
    }

    public static void init(int nodeIndex) {
        if (nodeIndex < 1) return;
        sumSegment[nodeIndex >> 1] = -1;
        init(nodeIndex >> 1);
    }

    public static long sumQuery(int queryL, int queryR, int nodeIndex, int nodeL, int nodeR) {
        if (queryR < nodeL || nodeR < queryL) return 0;
        if (queryL <= nodeL && nodeR <= queryR) return sumSegment[nodeIndex];
        int mid = (nodeL + nodeR) >> 1;
        return sumQuery(queryL, queryR, nodeIndex << 1, nodeL, mid) + sumQuery(queryL, queryR, (nodeIndex << 1) + 1, mid + 1, nodeR);
    }
}
