class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer>ans=new ArrayList<>();
        ans.add(0);
        ans.add(gain[0]);
         if (gain.length == 0) return 0;

        for(int i=1;i<gain.length;i++){
         int num=gain[i]+ans.get(i);
         ans.add(num);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.size();i++){
           if(max<ans.get(i)){
            max=ans.get(i);
           }
        }
        return max;
    }
}