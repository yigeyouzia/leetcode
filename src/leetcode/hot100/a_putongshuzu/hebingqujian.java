package leetcode.hot100.a_putongshuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.cn/problems/merge-intervals/?envType=study-plan-v2&envId=top-100-liked
public class hebingqujian {


    public static void main(String[] args) {
        hebingqujian hebingqujian = new hebingqujian();
        int[][] test = new int[][]{{1, 3}, {2, 6}, {2, 3}, {15, 18}};
        hebingqujian.merge(test);
    }


    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (len == 0) {
            return new int[][]{};
        }

        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < len; i++) {
            int l = intervals[i][0], r = intervals[i][1];
            int rlen = res.size();
            if (res.isEmpty() || res.get(res.size() - 1)[1] < l) {
                res.add(new int[]{l, r});
            } else {
                res.get(rlen - 1)[1] = Math.max(res.get(res.size() - 1)[1], r);
            }
        }
        // 转换为二维数组并打印
        int[][] result = res.toArray(new int[res.size()][]);
        System.out.println("合并后的区间: " + Arrays.deepToString(result));
        return result;
    }
}
