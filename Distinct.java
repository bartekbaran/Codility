import java.util.*;

class Solution {
    public int solution(int[] A) {
        return (int) Arrays.stream(A).boxed().distinct().count();
    }
}
