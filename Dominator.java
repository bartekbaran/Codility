import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            return -1;
        }

        if (A.length == 1) {
            return 0;
        }

        final Map<Integer,Long> mapOfOccurences = IntStream.of(A)
            .boxed()
            .collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()));

        final int possibleDominator = mapOfOccurences.entrySet()
            .stream()
            .max(Comparator.comparingLong(Map.Entry::getValue))
            .map(Map.Entry::getKey)
            .orElse(null);

        if (mapOfOccurences.get(possibleDominator) <= A.length / 2) {
            return -1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == possibleDominator) {
                return i;
            }
        }

        return -1;
    }
}