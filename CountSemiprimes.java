import java.util.*;

class Solution {

    private List<Integer> primes = new ArrayList<>();
    private SortedSet<Integer> semiprimes = new TreeSet<>();

    public int[] solution(int N, int[] P, int[] Q) {
        int[] result = new int[P.length];
        this.calculatePrimes(N);
        this.calculateSemiprimes(N);

        for (int i = 0; i < P.length; i++) {
            final int min = P[i];
            final int max = Q[i];

            long numberOfSemiprimesBetween = this.semiprimes.stream().filter(n -> n >= min && n <= max).count();
            result[i] = (int) numberOfSemiprimesBetween;
        }

        return result;
    }

    private void calculatePrimes(final int N) {
        int flag = 0;
        for (int i = 2; i < N / 2 + 1; i++) {
            flag = 0;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                continue;
            }
            this.primes.add(i);
        }
    }

    private void calculateSemiprimes(final int N) {
        for (int i = 0; i < primes.size(); i++) {
            for (int j = 0; j <= i; j++) {
                int semiprime = this.primes.get(i) * this.primes.get(j);
                if (semiprime > N) {
                    continue;
                }
                this.semiprimes.add(semiprime);
            }
        }
    }
}