package leetcode.swordToOffer;

public class _0021 {
    class Solution {
        public int[] exchange(int[] nums) {
            int index=0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]%2==1) {
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    index++;
                }
            }
            return nums;
        }
    }
}