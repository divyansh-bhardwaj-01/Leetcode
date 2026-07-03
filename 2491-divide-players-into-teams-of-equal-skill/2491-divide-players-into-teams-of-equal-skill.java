class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length==2){
            return skill[0]*skill[1];
        }
        Arrays.sort(skill);
        int ans=(skill[0]+skill[skill.length-1]);
        int j=skill.length-2;
        int count=1;
        for(int i=1;i<skill.length-1;i++){
          if(i>j){
            break;
          }
          if(ans==skill[i]+skill[j])
          count++;
          j--;
        }
        j=skill.length-1;
        long sum=0;
        if(count==skill.length/2){
            for(int i=0;i<skill.length;i++){
                if(i>j){
                    break;
                }
                sum=sum+skill[i]*skill[j];
                j--;
            }
        }
        if(count==skill.length/2){
        return sum;}
        else{
            return -1;
        }
    }
}