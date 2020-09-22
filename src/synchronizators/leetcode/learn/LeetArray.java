package synchronizators.leetcode.learn;

public  class LeetArray {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] mas = {1,7,3,6,5,6,22};
        int[] mas2 = {-1,-1,-1,-1,-1,-1};
        int[] mas3 = {-1,-1,-1,0,1,1};
        int[] mas4 = {-1,-1,0,0,-1,-1};
        System.out.println(pivotIndex(mas4));
    }
}
