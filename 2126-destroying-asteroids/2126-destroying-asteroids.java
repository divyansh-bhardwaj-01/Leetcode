class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mas=mass;
        for(int i=0;i<asteroids.length;i++){
            if(mas==asteroids[i]){
                mas=mas+asteroids[i];
            }
            else if(mas>asteroids[i]){
                mas=mas+asteroids[i];
            }
            else if(mas<asteroids[i]){
                return false;
            }
        }
        return true;
    }
}