class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord)   {
        int sum1=0;
        int sum2=0;
        int tar=0;
        for(char ch:firstWord.toCharArray()){
            sum1=sum1*10+(ch-'a');
        }
        for(char ch:secondWord.toCharArray()){
            sum2=sum2*10+(ch-'a');
        }
        for(char ch:targetWord.toCharArray()){
            tar=tar*10+(ch-'a');
        }
        int tot=sum1+sum2;
        
        if(tot==tar){
            return true;
        }
        return false;

    }
}