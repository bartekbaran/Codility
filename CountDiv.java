import java.lang.Math;

class Solution {
    public int solution(int A, int B, int K) {

        int numOfDivisibleSmallerThanB = (int) Math.floor(B/K);
        int numOfDivisibleSmallerThanA = (int) Math.floor(A/K);

        if (A % K == 0) {
            return numOfDivisibleSmallerThanB - numOfDivisibleSmallerThanA + 1;
        }

        return numOfDivisibleSmallerThanB - numOfDivisibleSmallerThanA;
    }
}