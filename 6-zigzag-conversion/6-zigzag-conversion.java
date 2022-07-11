class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1){ return s; }
        
        Character[][] arr = new Character[1000][1000];
        int box = (numRows-1)*2;
        
        int x = 0, y = 0;
        arr[x][y] = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(1<=(i%box)&&(i%box)<=(box/2)){
                x++;
            }else{
                x--;
                y++;
            }
            arr[x][y] = s.charAt(i);
        }
        String answer = "";
        for(int i=0; i<numRows; i++){
            for(int j=0; j<=y; j++){
                if(arr[i][j]!=null){
                    answer += arr[i][j];
                }
            }
        }
        return answer;
    }
}