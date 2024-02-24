class Solution {
    public int solution(int[] A) {
        int passingCars = 0;
        int eastCars = 0;

        for (int element : A) {
            if (element == 0) {
                eastCars++;
            } else {
                passingCars += eastCars;
                if (passingCars > 1000000000) {
                    return -1;
                }
            }
        }

        return passingCars;
    }
}
