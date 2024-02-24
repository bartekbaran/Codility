import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);

        for(int i = 2; i< A.length; i++) {
            if ((long) A[i-2] + (long) A[i-1] > (long) A[i]) {
                return 1; 
            }
        }

        return 0;
    }
}
