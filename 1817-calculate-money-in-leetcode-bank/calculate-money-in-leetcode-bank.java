class Solution {
    public int totalMoney(int n) {
        int total=0;
        int ws=1;
        while(n>0){
            int day=ws;
            for(int i=0;i<7&&n>0;i++){
                total=total+day;
                day++;
                n--;
            }
            ws++;
        }
        return total;
    }
}