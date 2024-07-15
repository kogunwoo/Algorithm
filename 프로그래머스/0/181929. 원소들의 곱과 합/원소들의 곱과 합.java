class Solution {
    public int solution(int[] num_list) {
        int answer = 0, sum = 0, sub = 1;
        //반복문을 통해 배열 전체를 순환 
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            sub *= num_list[i];
        }
        //반복문에서 더한 값을 제곱해준다. 
        sum *= sum; 
        
        //조건문과 똑같다. sum이 더 크면 1을 리턴해주고, sub가 더크면 0을 리턴해준다. 
        answer = (sum > sub) ? 1 : 0 ;
        return answer;
    }
}
