class Solution {
public:
    int maximum69Number (int num) {
         long long divisor = 1;
    while (num / divisor >= 10) {
        divisor *= 10;
    }
    


int newvar=0;
int count=0;
    while (divisor > 0) {
        int digit = num / divisor;   
         if(digit==6 && count==0){
            digit=9;
            count++;
         }     
         newvar=newvar*10+digit;
        num = num % divisor;         
        divisor /= 10;               
    }
return newvar;
    
    }
};