class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        for(int i=0;i<spaces.length;i++){
            if(count>=1){
             sb.insert(spaces[i]+i,' ');
            }
            else{
                sb.insert(spaces[i],' ');
            }
            count++;
        }
        return sb.toString();
    }
}