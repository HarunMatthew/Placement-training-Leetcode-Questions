class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            int digit=n%10;
            list.add(digit);
            n=n/10;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int prod=list.get(i)*list.get(j);
                if(prod>max){
                    max=prod;
                }
            }
        }
        return max;
    }
}