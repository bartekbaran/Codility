class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) {
            return A;
        }

        while (K >= A.length) {
            K -= A.length;
        }
        
        if (K == 0) {
            return A;
        }

        int[] rotatedArray = new int[A.length];
        int nextItemPos;


        for (int i = 0; i < A.length; i++) {
            if (i - K >= 0) {
                nextItemPos = i - K;
            } else {
                nextItemPos = A.length - K + i;
            }

            rotatedArray[i] = A[nextItemPos];
        }

        return rotatedArray;
    }
}
