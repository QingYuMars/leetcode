package com.atguigu.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum {

    /*给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
    示例:
    给定 nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]*/
    /*
    * 1.遍历求和,比较
    * 2.得到下标*/
    public int[] twoSum_1(int[] nums, int target) {
        Integer length = nums.length;
        for (int i = 0;i<length;i++){
            for (int j=i+1;j<length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    //以后遇到双重for循环先考虑用map代替一层
    public int[] towSum_2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(Arrays.toString(sum.twoSum_1(new int[]{2, 7, 11, 15},9)));
        System.out.println(Arrays.toString(sum.towSum_2(new int[]{2, 7, 11, 15},9)));
    }
}
