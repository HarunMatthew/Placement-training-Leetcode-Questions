class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int ans = 0;

        for(int i=num1;i<=num2;i++){
            ans = ans + win(i);
        }
        return ans;
    }
    public int win(int n){

        int digit[] = new int[10];

        int size = 0;
        while(n>0){
            digit[size++]=n%10;
            n=n/10;
        }
        if(size<3){
            return 0;
        }

        int count = 0;

        for(int i=1;i<size-1;i++){
            if(digit[i-1] < digit[i] && digit[i] > digit[i+1]){
                count++;
            }
            else if(digit[i-1] > digit[i] && digit[i] < digit[i+1]){
                count++;
            }
           
        }
        return count;
        
    }
}