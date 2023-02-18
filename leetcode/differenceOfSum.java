class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (Integer integer : nums) {
            elementSum += integer;
            while (integer > 0) {
                digitSum+=integer%10;
                integer=integer/10;
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}
