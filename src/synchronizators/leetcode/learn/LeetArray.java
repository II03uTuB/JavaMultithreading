package synchronizators.leetcode.learn;

public  class LeetArray {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int center = -1;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = 0;
            for (int j = nums.length - 1; j > i + 1; j--) {
                rightSum += nums[j];
                if (leftSum == rightSum) {
                    center = i + 1;
                    break;
                }
            }
        }
        return center;
}


    public static void main(String[] args) {
        int[] mas = {1,7,3,6,5,6,22};
        int[] mas2 = {};
        System.out.println(pivotIndex(mas2));
    }
}
