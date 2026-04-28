class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      ArrayList<Integer>ans=new ArrayList<>();
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            ans.add(grid[i][j]);
        }
      }  
   
      int arr[]=new int[2];
      HashMap<Integer,Integer>mp=new HashMap<>();
      for(int i:ans){
        mp.put(i,mp.getOrDefault(i,0)+1);
      }
      for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
        int key=entry.getKey();
        int value=entry.getValue();
        if(value==2){
            arr[0]=key;
        }
      }

      int num=1;
      TreeSet<Integer>st=new TreeSet<>(ans);
      for(int i:st){
        if(num!=i){
            arr[1]=num;
            break;
        }
        num++;
      }
      if(num==st.size()+1){
        arr[1]=num;
      }

      
      return arr;
    }
}