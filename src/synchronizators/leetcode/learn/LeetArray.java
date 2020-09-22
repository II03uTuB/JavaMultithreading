package synchronizators.leetcode.learn;

public  class LeetArray {
    public static int pivotIndex(int[] nums) {
        int rightSum = 0, leftSum = 0;
        for (int x: nums) rightSum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftSum == rightSum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
