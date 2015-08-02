public class Solution {
    public ArrayList<Integer> findSubstring(String S, String[] L) {
        if(L.length==0 || L==null) return null;
        int n = L.length;
        int m = L[0].length();
        int l = S.length();
        ArrayList<Integer> res = new ArrayList<Integer>();
        Map<String,Integer> covered = new HashMap<String,Integer>();
        for (int i=0;i<n;i++){
            if(covered.containsKey(L[i])){
                covered.put(L[i],covered.get(L[i])+1);
            }else{
                covered.put(L[i],1);
            }
        }
        
        //substring check
        int i=0,j=0;
        while(l-i>=n*m){
            Map<String,Integer> temp=new HashMap<String, Integer>(covered);
            for(j=0;j<n;j++){
                String str=S.substring(i+j*m,i+(j+1)*m);
                if(temp.containsKey(str)){
                    if(temp.get(str)-1>0){
                        temp.put(str,temp.get(str)-1);
                    }else{
                        temp.remove(str);
                    }
                }else{
                    break;
                }
            }
            if(temp.size()==0) res.add(i);
            i++;
        }
        return res;
    }
}