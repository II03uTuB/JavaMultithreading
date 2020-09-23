package learn.hashtables;

public class LargestNumber {
    public static int dominantIndex(int[] nums) {
        int candidate = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j - 1] > nums[j]) {
                    int tmp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        if(nums[nums.length - 2] * 2 <= nums[nums.length - 1]) {
            return nums.length - 1;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] mas = {3, 6, 1, 0};
        System.out.println(dominantIndex(mas));
    }
}
