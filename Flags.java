import java.util.*;

class Solution {
    public int solution(int[] A) {
        final List<Integer> heightList = Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[]::new));
        final List<Integer> applicableIndexesForFlag = new ArrayList<>();

        for (int i = 1; i < heightList.size() - 1; i++) {
            if (heightList.get(i - 1) < heightList.get(i) && heightList.get(i + 1) < heightList.get(i)) {
                applicableIndexesForFlag.add(i);
            }
        }

        int k = 1;
        int lastFlag = 0;
        int flagCount = 0;
        boolean stopLoop;

        while (true) {
            stopLoop = true;
            for (int i = 0; i < applicableIndexesForFlag.size(); i++) {
                if (lastFlag == 0) {
                    if (k == 1) {
                        k++;
                    }
                    lastFlag = applicableIndexesForFlag.get(i);
                    flagCount++;
                    continue;
                } 
                
                if (applicableIndexesForFlag.get(i) - lastFlag >= k) {
                    lastFlag = applicableIndexesForFlag.get(i);
                    flagCount++;
                }

                if (flagCount == k) {
                    k++;
                    flagCount = 0;
                    lastFlag = 0;
                    stopLoop = false;
                    break;
                }
            }

            if (stopLoop) {
                k--;
                break;
            }
        }

        return k;
    }
}
