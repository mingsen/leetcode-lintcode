public class Solution {
    public int trap(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        int max = 0;
        if(A.length==0) return 0;
        for(int i=0;i<A.length;i++){
            left[i]=max = Math.max(max,A[i]);
        }
        max=0;
        for(int i=A.length-1;i>=0;i--){
            right[i]=max = Math.max(max,A[i]);
        }
        max=0;
        for(int i=0;i<A.length-1;i++){
            max+=Math.min(left[i],right[i])-A[i];
        }
        return max;
    }
}