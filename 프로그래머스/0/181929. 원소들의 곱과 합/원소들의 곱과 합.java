class Solution {
    public int solution(int[] num_list) {
     int sum = 0; 
     int  a = 1; 
     int  c = num_list.length;
     
    for(int i = 0; i<c; i++){
        sum += num_list[i];
          a *= num_list[i];
    } 
        if(a < (sum*sum)){
            return 1;
        }
        return 0;
    }
}
