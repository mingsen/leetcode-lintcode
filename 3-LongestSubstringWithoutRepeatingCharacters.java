public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        int max=0;
        int left=0;
        int right=0;
        
        for(;right<s.length();right++){
            if(set.contains(s.charAt(right))){
                max=Math.max(right-left,max);
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }else{
                set.add(s.charAt(right));
            }
        }
        return Math.max(right-left,max);
     }
}