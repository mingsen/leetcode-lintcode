public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0) return 0;
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int left=0, right=0;
        
        while(right<nums.length){
            sum+=nums[right++];
            
            while(sum>=s && left<=right){
                min=Math.min(min,right-left);
                sum-=nums[left++];
            }
        }
        
        return min==Integer.MAX_VALUE?0:min;
    }
}