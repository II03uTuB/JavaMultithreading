package synchronizators.leetcode.learn;

public  class LeetArray {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int center = -1;
        if(nums.length == 0) {
            return center;
        }
        for (int i = 0, j = nums.length - 1; i < nums.length && j > -1; i++, j-- ) {
            leftSum += nums[i];
            rightSum += nums[j];
            System.out.println(leftSum + " " + rightSum);
            if(leftSum == rightSum) {
                System.out.println("yes");
                if(j == i + 2) {
                    System.out.println("center");
                    center = i + 1;
                    break;
                }
            }
        }
        return center;
    }

    public static void main(String[] args) {
        int[] mas = {1,7,3,6,5,6};
        System.out.println(pivotIndex(mas));
    }
}
