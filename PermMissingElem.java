import java.util.stream.IntStream;
import java.util.*;

class Solution {
	public int solution(int[] A) {
		int fullPermutation = IntStream.rangeClosed(1, A.length + 1).sum();
		int actualSum = Arrays.stream(A).sum();
		return fullPermutation - actualSum; 
	}
}