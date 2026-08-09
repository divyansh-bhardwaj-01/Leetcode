class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int st=1;
        int end=plants.length-2;
        int ans=0;
        int diff1=capacityA-plants[0];
        int diff2=capacityB-plants[plants.length-1];
        while(st<=end){
            int max=Math.max(diff1,diff2);
            if(st==end){
                if(diff1<plants[st] && diff2<plants[end]) ans++;
                break;
            }
            
            if(diff1>=plants[st] && st!=end)
            diff1=diff1-plants[st];
            else{
            diff1=capacityA-plants[st];
            ans++;}

             if(diff2>=plants[end] && st!=end)
            diff2=diff2-plants[end];
            else{
            ans++;
            diff2=capacityB-plants[end];}
            
            st++;
            end--;
        } 
return ans;
    }
}