import java.lang.Math;

class Solution {
    public int solution(int[] A) {

        float min = Float.MAX_VALUE;
        int correctIndex = 0;

        for (int i = 0; i < A.length - 2; i++) {
            float lowerAvg = Math.min((float) (A[i] + A[i + 1]) / 2,
                                      (float) (A[i] + A[i + 1] + A[i + 2]) / 3);

            if (lowerAvg < min) {
                min = lowerAvg;
                correctIndex = i;
            }
        }

        float minOfLastTwo = (float) (A[A.length - 1] + A[A.length - 2]) / 2;
        if (minOfLastTwo < min) {
            return A.length - 2;
        }

        return correctIndex;
    }
}