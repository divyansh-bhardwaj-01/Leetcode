class Solution {
    public int minChanges(String s) {
        int count=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i%2==0){
                num=ch-'0';
            }
            if(i%2!=0 && num!=ch-'0'){
                count++;
            }
        }
        return count;
    }
}