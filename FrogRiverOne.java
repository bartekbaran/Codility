import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int X, int[] A) {
        final Map<Integer, Integer> timeWhenLeafFallsByPosition = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!timeWhenLeafFallsByPosition.containsKey(A[i])) {
                timeWhenLeafFallsByPosition.put(A[i], i);
            }
        }

        if (timeWhenLeafFallsByPosition.size() != X) {
            return -1;
        }

        int lastLeaf = 0;
        for (int i = 1; i < X + 1; i++) {
            if (!timeWhenLeafFallsByPosition.containsKey(i)) {
                return -1;
            }
            if (lastLeaf < timeWhenLeafFallsByPosition.get(i)) {
                lastLeaf = timeWhenLeafFallsByPosition.get(i);
            }
        }

        return lastLeaf;
    }
}
