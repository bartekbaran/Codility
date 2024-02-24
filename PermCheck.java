import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] A) {
        int sumOfA = Arrays.stream(A).sum();
        int shouldBe = IntStream.rangeClosed(1, A.length).sum();
        return sumOfA == shouldBe ? 1 : 0;
    }
}
