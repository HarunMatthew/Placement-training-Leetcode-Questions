class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n = i;
            int n1 = n;
            boolean flag = true;

            while(n1!=0){
                int digit = n1%10;

                
                
                if(digit ==0 || n%digit != 0){
                    flag = false;
                    break;
                }
                
                
                n1 = n1/10;
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}