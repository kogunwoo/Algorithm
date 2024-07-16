class Solution {
    public int solution(int[] num_list) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                a.append(num);
            } else {
                b.append(num);
            }
        }
        
        int sum1 = Integer.parseInt(b.toString());
        int sum2 = Integer.parseInt(a.toString());
        
        return sum1 + sum2;
    }
}
