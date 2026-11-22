class Solution {
    public boolean checkString(String s) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ans.add(i);
            }
        }
        for(int i=0;i<ans.size();i++){
            if(i!=ans.get(i)){
                return false;
            }
        }
        return true;
    }
}