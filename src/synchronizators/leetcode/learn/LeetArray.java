package synchronizators.leetcode.learn;

public  class LeetArray {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int center = -1;
        if(nums.length == 0) {
            return -1;
        }
        for (int i = -1; i < nums.length; i++) {
            if (i == -1){
                leftSum += 0;
            }
            else{
                leftSum += nums[i];
            }
            int rightSum = 0;
            for (int j = nums.length - 1; j > i ; j--) {
                rightSum += nums[j];
                System.out.println(i + " " + j);
                if (leftSum == rightSum) {
                    if(j == i + 2) {
                        center = i + 1;
                        break;
                    }
                }
            }
        }
        return center;
    }


    public static void main(String[] args) {
        int[] mas = {1,7,3,6,5,6,22};
        int[] mas2 = {-1,-1,-1,-1,-1,-1};
        int[] mas3 = {-1,-1,-1,0,1,1};
        int[] mas4 = {-1,-1,0,0,-1,-1};
        System.out.println(pivotIndex(mas4));
    }
}
