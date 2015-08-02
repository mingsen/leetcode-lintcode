public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0]=1;
        int right=1;
        // first scan from left to right
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        // second scan from right to left
        for(int i=nums.length-2;i>=0;i--){
            right=right*nums[i+1];
            res[i]=res[i]*right;
        }
        return res;
    }
}