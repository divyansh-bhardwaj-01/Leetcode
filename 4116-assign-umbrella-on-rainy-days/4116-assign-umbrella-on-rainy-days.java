class Solution {
    public String[] assignUmbrella(int[] rain) {
        int a=0;
        int b=0;
        int len=rain.length;
        String[] arr = new String[rain.length];
        ArrayList<String>list=new ArrayList<>();
         for(int i=0;i<rain.length-1;i++){
             if(rain[i]==1 && rain[i+1]==1){
             if(a<=b){
                 list.add("Alice");
                 a++;
             }
             else{
                 list.add("Bob");
                 b++;
             }
             }
             else if(rain[i]==1){
                 list.add("Bob");
                 b++;
             }
             else{
                 list.add("None");
             }
         }
        if(rain[len-1]==0){
            list.add("None");
        }
        else{
            list.add("Bob");
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}