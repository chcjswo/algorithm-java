package hellocoding.ch_1;

import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @since 2021-01-14
 **/
public class Ch_01 {

    public int solution(List<Integer> list, int i) {
        int high = list.size() - 1;
        int low = 0;

        while (low <= high) {
            int mid = (high + low) / 2;
            int result = list.get(mid);

            if (result == i) {
                return mid;
            }
            if (result  > i) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0;
    }
}
