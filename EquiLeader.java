import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        final Map.Entry<Integer, Long> dominatorEntry = IntStream.of(A)
            .boxed()
            .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Comparator.comparingLong(Map.Entry::getValue))
            .orElse(null);

        final Integer dominator = dominatorEntry.getKey();

        Long occurencesOfDominatorOnTheRight = dominatorEntry.getValue();
        int occurencesOfDominatorOnTheLeft = 0;

        if (occurencesOfDominatorOnTheRight <= A.length / 2) {
            return 0; 
        }

        int result = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == dominator) {
                occurencesOfDominatorOnTheLeft++;
                occurencesOfDominatorOnTheRight--;
            }

            if (occurencesOfDominatorOnTheLeft > ((i + 1) / 2) && 
                occurencesOfDominatorOnTheRight > ((A.length - i - 1) / 2)) {
                result++;
            }
        }

        return result;
    }
}