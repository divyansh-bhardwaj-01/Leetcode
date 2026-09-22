class Solution {
    public int candy(int[] ratings) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int[] left=new int[ratings.length];
        int[] right=new int[ratings.length];
        
        for(int i=0;i<ratings.length;i++){
            left[i]=1;
            right[i]=1;
        }
        for(int i=1;i<ratings.length;i++){
           if(ratings[i]>ratings[i-1]) right[i]=right[i-1]+1;
        }

        for(int i=ratings.length-2;i>=0;i--){
           if(ratings[i]>ratings[i+1]) left[i]=left[i+1]+1;
        }

        for(int i=0;i<ratings.length;i++){
            ratings[i]=Math.max(right[i],left[i]);
        }
        for(int i=0;i<ratings.length;i++){
            sum=sum+ratings[i];
        }
        return sum;
       
    }
}