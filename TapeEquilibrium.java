import java.util.*;
import java.lang.Math;

class Solution {
	public int solution(int[] A) {
		int left = A[0];
		int right = Arrays.stream(A).skip(1).sum();
		int minResult = Integer.MAX_VALUE;

		for (int i = 1; i < A.length; i++) {
			if (Math.abs(left - right) < minResult) {
				minResult = Math.abs(left - right);
			}

			left += A[i];
			right -= A[i];
		}

		return minResult;
	}
}