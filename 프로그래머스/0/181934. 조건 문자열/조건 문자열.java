class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals("<") && eq.equals("!")) {
            if (n < m) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m) {
                return 1;
            } else {
                return 0;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            if (n > m) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0; 
    }
}
