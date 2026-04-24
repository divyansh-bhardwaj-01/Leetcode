class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pointL=0;
        int pointR=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                pointL++;
            }
            else if(moves.charAt(i)=='R'){
                pointR++;
            }
        }
        
        for(int i=0;i<moves.length();i++){
             if(pointL==pointR){
                 pointR=moves.length()-pointL;
                 break;
            }
            if(pointL>pointR){
                if(moves.charAt(i)=='_'){
                    pointL++;
                }
            }
            if(pointL<pointR){
                if(moves.charAt(i)=='_'){
                    pointR++;
                }
            }
        }
        return Math.abs(pointL-pointR);
    }
}