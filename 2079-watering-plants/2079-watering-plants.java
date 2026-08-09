class Solution {
    public int wateringPlants(int[] plants, int capacity) {
     int ans=1;
     int diff=capacity-plants[0];
     for(int i=1;i<plants.length;i++){
        if(diff>=plants[i]){
          diff=diff-plants[i];
          ans++;
        }
        else{
            ans=ans+i+i+1;
            diff=capacity-plants[i];
        }
     }  
     return ans; 
    }
}