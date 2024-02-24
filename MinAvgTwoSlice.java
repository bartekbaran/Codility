import java.util.*;

class Solution {
    public int solution(int[] A) {

        double min = Double.MAX_VALUE;
        int correctIndex = 0;
        double currentValue = 0;

        for (int i = 0; i < A.length - 1; i++) {
            currentValue = A[i];
            for (int j = i + 1; j < A.length; j++) {
                currentValue += A[j];
                if (currentValue / (j - i + 1) < min) {
                    min = currentValue / (j - i + 1);
                    correctIndex = i;
                }
            }
        }
        return correctIndex;
    }
}
