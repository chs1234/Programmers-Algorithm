package level1.math_sqrt;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(121));
		System.out.println(s.solution(3));

		System.out.println(s.solution2(121));
		System.out.println(s.solution2(3));
	}
	
    public long solution(long n) {
    	long answer = (long)Math.sqrt(n);
  
    	return (Math.pow(answer, 2) == n) ? (long) Math.pow(answer + 1, 2) : -1;
    }
    
    public long solution2(long n) {
    	long answer = 0;
    	
    	for (long i = 1; i <= n; i++) {
    		if (i * i == n) {
    			answer = (i + 1) * (i + 1);
    			break;
    		}
    		else {
    			answer = -1;
    		}
    	}
    	
    	return answer;
    }
}
