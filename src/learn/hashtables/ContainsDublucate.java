package learn.hashtables;

public class ContainsDublucate {
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    return true;
                }
            }
        }
            return false;
    }
}
