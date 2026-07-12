class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==1){
            return new int[]{1};
        }
        int[] nums=new int[arr.length];

        Set<Integer>st=new TreeSet<>();
        for(int i:arr){
            st.add(i);
        }
        List<Integer>list=new ArrayList<>(st);
         Map<Integer,Integer>mp=new HashMap<>();
         for(int i=0;i<list.size();i++){
            mp.put(list.get(i),i+1);
         }

         for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                nums[i]=mp.get(arr[i]);
            }
         }
         return nums;

    }
}