class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            ans.add(Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0')));
        }
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>2){
                return false;
            }
        }
        return true;
    }
}