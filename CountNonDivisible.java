import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] A) {
        int[] result = new int[A.length];
        Map<Integer, Integer> divisibleMap = new HashMap<>();
        int nonDivisorsCount;

        for (int currentItem = 0; currentItem < A.length; currentItem++) {
            nonDivisorsCount = 0;

            if (divisibleMap.containsKey(A[currentItem])) {
                result[currentItem] = divisibleMap.get(A[currentItem]);
                continue;
            }

            for (int otherItemToBeChecked = 0; otherItemToBeChecked < A.length; otherItemToBeChecked++) {
                if (A[currentItem] % A[otherItemToBeChecked] != 0) {
                    nonDivisorsCount++;
                }
            }
            divisibleMap.put(A[currentItem], nonDivisorsCount);
            result[currentItem] = nonDivisorsCount;
        }

        return result;
    }
}
