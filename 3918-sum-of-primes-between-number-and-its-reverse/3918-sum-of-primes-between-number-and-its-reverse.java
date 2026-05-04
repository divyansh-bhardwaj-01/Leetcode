class Solution {
    public int sumOfPrimesInRange(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int reverse = 0;
        int freq=0;
        if (n<=9) {
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    freq++;
                }
            }
        
        if(freq==2){
                return n;
            }
        else{
            return 0;
        }
        }
        int original=n;  
        while (n!=0) {
            int digit = n%10;
            reverse = reverse*10+digit;
            n =n/10;
        }
 
        int start = Math.min(original, reverse);
        int end = Math.max(original, reverse);

        for (int i =start;i<=end;i++) {
            int num = i;
            int count = 0;

            for (int j=1;j<=num;j++) {
                if (num%j==0) {
                    count++;
                }
            }

            if (count==2) {
                ans.add(num);
            }
        }

        int sum=0;
        for (int j=0;j<ans.size();j++) {
            sum = sum+ans.get(j);
        }

        return sum;
    }
}