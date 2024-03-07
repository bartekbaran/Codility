import java.util.stream.IntStream;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int localMaximum = 0;
        int localMinimum = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                localMinimum = localMaximum;
            } else {
                if (result[A[i] - 1] < localMinimum) {
                    result[A[i] - 1] = localMinimum;
                }

                result[A[i] - 1]++;

                if (result[A[i] - 1] > localMaximum) {
                    localMaximum = result[A[i] - 1];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (result[i] < localMinimum) {
                result[i] = localMinimum;
            }
        }

        return result;
    }
}