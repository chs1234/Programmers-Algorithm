package level1.sum_of_divisor;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.solution(12)); // 28
		System.out.println(s.solution(5));  // 6
	}
	
	public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
        	if (n % i == 0)
        		answer += i;
        }
        
        return answer;
    } 
}
