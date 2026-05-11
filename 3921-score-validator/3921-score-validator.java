class Solution {
    public int[] scoreValidator(String[] events) {
                int score=0;
        int counter=0;
        for(int i=0;i<events.length;i++){
           if(events[i].equals("W")){
             counter++;
             if(counter==10){
                break;
             }

           }
           
          else if(events[i].equals("WD") || events[i].equals("NB")){
            score=score+1;
           }
            else{
           score=score+Integer.parseInt(events[i]);
           }
        }
         int[] arr=new int[2];
          arr[0]=score;
          if(counter>10){
            arr[1]=10;
          }
          else{
            arr[1]=counter;
          }
          return arr;
    }
}