import java.util.*;

class Solution {
    public int reverse(int x) {
        
        long n = x;
       
        List<Long> list = new ArrayList<>();
        while(true){
            list.add(n%10);
            n /= 10;
            if(n==0){ break; }
        }
        
        long answer = 0;
        int index = 1;
        
        for(int i = list.size()-1; 0<=i; i--){
            answer += list.get(i)*index;
            if(answer<Integer.MIN_VALUE||Integer.MAX_VALUE<answer){
                return 0;
            }
            index *= 10;
        }
        return (int)answer;
    }
}