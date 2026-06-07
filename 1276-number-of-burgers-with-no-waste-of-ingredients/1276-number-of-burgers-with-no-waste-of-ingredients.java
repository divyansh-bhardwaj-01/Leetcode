class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer>ans=new ArrayList<>();
        if(cheeseSlices>tomatoSlices){
            return new ArrayList<>();
        } if(cheeseSlices==0 && tomatoSlices==0){
             ans.add(0);
             ans.add(0);
             return ans;
        }

        for(int i=0;i<=cheeseSlices;i++){
            int j=cheeseSlices-i;
            if((4*i)+(2*j)==tomatoSlices){
                ans.add(i);
                ans.add(j);
                return ans;
            }
        }
         return new ArrayList<>();
    }
}