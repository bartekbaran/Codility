class Solution {
    public int solution(int A, int B, int K) {
        if (K > B || A == B) {
            return 1;
        }

        int first = 0;
        int last = B - (B % K);

        if (A % K != 0) {
            first = A + (K - (A % K));
        } else {
            first = A;
        }

        return (last - first) / K + 1;
    }
}
