class Solution {
    public int xorOperation(int n, int start) {
        ArrayList<Integer>ans=new ArrayList<>();
       for(int i=0;i<n;i++){
        ans.add(start + 2*i);
       } 
       int num=ans.get(0);
       for(int i=1;i<ans.size();i++){
         num=num^ans.get(i);
       }
       return num;
    }
}