class Solution {
    public int solution(int a, int d, boolean[] included) {
       
        int sum =0;
        for(int i = 1; i<=included.length; i++){
            if(included[i-1] == true)
                sum += (a+(i-1)*d);
            
        }
        return sum;
    }
}