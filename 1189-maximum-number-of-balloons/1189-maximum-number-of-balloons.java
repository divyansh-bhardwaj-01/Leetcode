class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int countb=0;int counta=0;int countl=0;int counto=0;
        int countn=0;
        for(char i:text.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }   
        for(char key:mp.keySet()){
            int value=mp.get(key);
            if(key=='b'){
                countb=countb+value;
            }
            else if(key=='a'){
                counta=counta+value;
            }
           else if(key=='l'){
                countl=countl+value;
            }
            else if(key=='o'){
                counto=counto+value;
            }
            else if(key=='n'){
                countn=countn+value;
            }
        }
  
        List<Integer>ans=new ArrayList<>();
        ans.add(countb);
        ans.add(counta);
        ans.add(countl/2);
        ans.add(counto/2);
        ans.add(countn);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)<min){
                min=ans.get(i);
            }
        }
        return min;
    }
}