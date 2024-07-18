// class Solution {
//     public int[] solution(int[] num_list) {
//         int[] answer = new int[num_list.length + 1];
        
//         if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
//             System.arraycopy(num_list, 0, answer, 0, num_list.length);
//             answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
//         } else {
//             System.arraycopy(num_list, 0, answer, 0, num_list.length);
//             answer[num_list.length] = num_list[num_list.length - 1] * 2;
//         }
//         return answer;
//     }
// }
//System.arraycopy 는 바자에서 배열간의 복사를 수행하는 메서드 
//System.arraycopy(원본 배열, 원본배열의 시작인덱스. 대상배열, 대상배열의 시작인덱스,복사할 길이)
// 원본배열: 복사하고자 하는 원본 배열
// 원본배열의 시작인덱스: 복사를 시작할 원본 배열의 인덱스
// 대상배열: 복사된 원본 배열의 요소들이 저장될 대상 배열
// 대상배열의 시작인덱스: 복사된 요소들이 대상 배열에서 저장될 시작 인덱스
// 복사할 길이: 복사할 요소들의 개수

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }

        answer[num_list.length] = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1]-num_list[num_list.length-2]:num_list[num_list.length-1]*2;
        return answer;
    }
}