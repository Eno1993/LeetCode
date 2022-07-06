import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        
        for(int i=0; i<s.length(); i++){
            Set<Character> set = new HashSet<>();
            
            f : for(int j=i; j<s.length(); j++){
                char c = s.charAt(j);
                if(!set.contains(c)){
                    set.add(c);
                }else{
                    break f;
                }
            }
            if(max<set.size()){ max = set.size(); }
        }
        return max;
    }
}