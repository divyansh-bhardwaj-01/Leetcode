class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
     int count=0;
     int[] arr=new int[A.length];
     HashMap<Integer,Integer>mp=new HashMap<>();
     for(int i=0;i<A.length;i++){
        mp.put(A[i],mp.getOrDefault(A[i],0)+1);
         mp.put(B[i],mp.getOrDefault(B[i],0)+1);
          if(A[i]!=B[i]){
            if(mp.get(A[i])==2){
                count++;
            }

            if(mp.get(B[i])==2){
                count++;
            }
          }
          else{
            if(mp.get(A[i])==2){
                count++;
            }
          }
          
         arr[i]=count;
     }   
     return arr;
    }
}