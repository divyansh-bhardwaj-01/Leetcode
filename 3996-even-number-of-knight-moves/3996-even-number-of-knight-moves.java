class Solution {
    public boolean canReach(int[] start, int[] target) {
        int st=start[0]+start[1];
        int end=target[0]+target[1];
        if(st%2 == end%2){
            return true;
        }
        return false;
    }
}