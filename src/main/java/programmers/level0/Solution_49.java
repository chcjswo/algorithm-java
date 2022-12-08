package programmers.level0;

/**
 * 캐릭터의 좌표
 *
 * @author mcjeon
 * @version 1.0.0
 * @since 2022-12-08
 **/
public class Solution_49 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result = {0, 0};
        int i1 = board[0] / 2;
        int i2 = board[1] / 2;
        for (String s : keyinput) {
            switch (s) {
                case "right":
                    if (result[0] < i1) {
                        result[0] += 1;
                    }
                    break;
                case "left":
                    if (result[0] > -i1) {
                        result[0] -= 1;
                    }
                    break;
                case "up":
                    if (result[1] < i2) {
                        result[1] += 1;
                    }
                    break;
                case "down":
                    if (result[1] > -i2) {
                        result[1] -= 1;
                    }
                    break;
                default:
            }
        }
        if (i1 < Math.abs(result[0])) {
            if (result[0] < 0) {
                result[0] = -i1;
            } else {
                result[0] = i1;
            }
        }
        if (i2 < Math.abs(result[1])) {
            if (result[1] < 0) {
                result[1] = -i2;
            } else {
                result[1] = i2;
            }
        }
        return result;
    }
}
