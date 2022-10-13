package inflearn.codingtest_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-10-13
 **/
public class SortComparator {

    public static void main(String[] args) {
        Interval in1 = new Interval(1, 3);
        Interval in2 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);

        final List<Interval> solve = solve(intervals);
        print(solve);
    }

    private static List<Interval> solve(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(a -> a.start));

        List<Interval> result = new ArrayList<>();
        Interval before = intervals.get(0);
        for (Interval cur : intervals) {
            if (before.end >= cur.start) {
                before.end = Math.max(cur.end, before.end);
            } else {
                result.add(before);
                before = cur;
            }
        }

        if (!result.contains(before)) {
            result.add(before);
        }

        return result;
    }


    private static void print(List<Interval> intervals) {
        for (final Interval interval : intervals) {
            System.out.println(interval.start + " " + interval.end);
        }
    }
}

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
