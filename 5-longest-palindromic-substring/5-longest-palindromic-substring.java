import java.util.*;

class Solution {
    public String longestPalindrome(String s) {
        
        String max_string = "";
        
        for(int p=0; p<s.length(); p++){//p를 기준으로 양쪽으로 늘려서 확인해볼꺼야(홀수)
            int l = p, r = p;
            while(0<=l-1&&r+1<s.length()&&s.charAt(l-1)==s.charAt(r+1)){
                l--;
                r++;
            }
            if(max_string.length()<r-l+1){ max_string = s.substring(l, r+1); }    
        }
        for(int p=0; p<s.length()-1; p++){//완전 대칭인 상태(짝수)
            int l = p, r = p+1;
            if(s.charAt(l)!=s.charAt(r)){ continue; }
            while(0<=l-1&&r+1<s.length()&&s.charAt(l-1)==s.charAt(r+1)){
                l--;
                r++;
            }
            if(max_string.length()<r-l+1){ max_string = s.substring(l, r+1);}
        }
        return max_string;
    }
}