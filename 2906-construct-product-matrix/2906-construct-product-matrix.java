class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int mod=12345;
        int size=row*col;
        int[]pref=new int[size];
        int[]suff=new int[size];
        pref[0]=grid[0][0]%mod;
         for(int i=1;i<size;i++){
            int j=i/col;
            int k=i%col;
             pref[i]=(int)((long)pref[i-1]*grid[j][k]%mod);
         }
         
          suff[size-1]=grid[row-1][col-1]%mod;
        for(int i=size-2;i>=0;i--){
            int j=i/col;
            int k=i%col;
            suff[i]=(int)((long)suff[i+1]*grid[j][k]%mod);
        }
        grid[0][0]=suff[1];
        grid[row-1][col-1]=pref[pref.length-2];
        for(int i=1;i<size-1;i++){
            int j=i/col;
            int k=i%col;
            grid[j][k]=(int)((long)pref[i-1]*suff[i+1]%mod);
        }
        return grid;
    }
}