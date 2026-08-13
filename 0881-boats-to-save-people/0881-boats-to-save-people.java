class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
       int st=0;
       int end=people.length-1;
       while(st<=end){
        if(people[st]+people[end]<=limit){
            st++;
        }
        count++;
        end--;
       } 
       return count;
    }
}