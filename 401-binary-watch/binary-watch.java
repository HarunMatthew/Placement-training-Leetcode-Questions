class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int min=0;min<60;min++){
                int hour=con(h);
                int mins=con(min);
                if(hour+mins==turnedOn){
                String time=h+":"+((min<10)?"0"+min:min);
                    list.add(time);
                }
            }
        }
        return list;

    }
    public int con(int n){
       int count=Integer.bitCount(n);
       return count;
    }
}