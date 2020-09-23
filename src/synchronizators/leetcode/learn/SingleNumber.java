package synchronizators.leetcode.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int a = 1;
        int res = 0;

        for(int i : nums){
            System.out.println(map.get(nums[i]));
            if(map.containsKey(nums[i])){
                map.replace(nums[i], a++);
                continue;
            }
            map.put(nums[i],a);

        }
        System.out.println("---------");
        for(int i = 0; i < map.size(); i++){
            System.out.println(map.get(nums[i]));
            if(map.get(nums[i]) == 1){
                System.out.println("______");
                return nums[i];
            }
        }
        System.out.println("++++++");
        return res;
    }

    public static void main(String[] args) {
        int[] mas = {2,2,1,1,4};

        System.out.println(singleNumber(mas));
    }
}
