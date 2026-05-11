class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> lst=new ArrayList<>();
        for(int num : nums)
        {
            int n=num,digits=0;
            while(n!=0)
            {
                n/=10;
                digits++;
            }
            int[] arr=new int[digits];
            for(int i=digits-1;i>=0;i--)
            {
                arr[i]=num%10;
                num/=10;
            }
            for(int el : arr)
                lst.add(el);
        }
        int k=0;
        int[] res=new int[lst.size()];
        for(int num : lst)
            res[k++]=num;
        return res; 
    }
}