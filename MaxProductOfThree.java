import java.util.*;

class Solution {
    public int solution(int[] A) {
        int[] biggestThree = Arrays.stream(A)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .limit(3)
            .mapToInt(Integer::intValue)
            .toArray();
      
        int multiplicationOfLowestTwo = Arrays.stream(A)
            .boxed()
            .sorted()
            .limit(2)
            .mapToInt(Integer::intValue)
            .reduce(1, (a, b) -> a * b);

        return biggestThree[0] * multiplicationOfLowestTwo > biggestThree[0] * biggestThree[1] * biggestThree[2] ?
            biggestThree[0] * multiplicationOfLowestTwo :
            biggestThree[0] * biggestThree[1] * biggestThree[2];
    }
}
