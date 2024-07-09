class Solution {
    public int solution(int[] num_list, int n) {
    for(int i =0; i < num_list.length; i++){
            if(num_list[i] == n){
                return 1;
            }
        }
        return 0;
    }
}


// import java.util.stream.IntStream;

// class Solution {
//     public int solution(int[] numList, int n) {
//         return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
//     }
// } 