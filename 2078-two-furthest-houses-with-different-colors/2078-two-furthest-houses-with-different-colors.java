class Solution {
    public int maxDistance(int[] colors) {
        int max1=0;
        int i=0;int j=colors.length-1;
        for(int k=0;k<colors.length;k++){
            if(colors[i]!=colors[j]){
                max1=Math.max(max1,Math.abs(j-i));
            }
            else{
                i++;
            }
        }
        int a=0;int b=colors.length-1;
            int max2=0;
            for(int k=0;k<colors.length;k++){
            if(colors[a]!=colors[b]){
                max2=Math.max(max2,Math.abs(b-a));
            }
            else{
                b--;
            }
            
        }
        return Math.max(max1,max2);
    }
}