class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int expectedSum = (l * (l + 1) / 2);

        int actualSum = 0;
        for (int n : nums){
            actualSum += n;
        }

        return expectedSum - actualSum;
    }
}
