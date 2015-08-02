public class Solution {
    public int maxArea(int[] height) {
        if(height.length<2)return 0;
        int max = Integer.MIN_VALUE;
        int left = 0, right=height.length-1;
        while(left<right){
            max=Math.max(max,Math.min(height[left],height[right])*(right-left));
            if(height[left]>height[right])right--;
            else left++;
        }
        return max;
    }
}