import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] A) {
        int[] sortedArray = Arrays.stream(A)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();

        return Math.max(sortedArray[0] * sortedArray[1] * sortedArray[2],
                        sortedArray[0] * sortedArray[A.length - 1] * sortedArray[A.length -2]);
    }
}