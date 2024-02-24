import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int smallestInt = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0) {
                continue;
            }

            if (A[i] == smallestInt) {
                smallestInt++;
            }
        }

        return smallestInt;
    }
}
