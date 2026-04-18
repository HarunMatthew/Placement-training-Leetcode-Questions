class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int sorted[]=score.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sorted[i],n-i);
        }
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            int rank=map.get(score[i]);
            if(rank==1){
                str[i]="Gold Medal";
            }
            else if(rank==2){
                str[i]="Silver Medal";
            }
            else if(rank==3){
                str[i]="Bronze Medal";
            }
            else{
                str[i]=String.valueOf(rank);
            }
        }
        return str;
    }
}