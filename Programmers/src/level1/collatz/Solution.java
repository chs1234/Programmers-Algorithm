package level1.collatz;

public class Solution {
	public static void main(String[] args) {
		int result = solution(626331);
		
		System.out.println(result); 
	}
	
	// me
	public static int solution(int n) {
		long num = n;
        int answer = 0;
        
        while (num != 1) {
            if (num % 2 == 0) num /= 2;
            else num = (num * 3) + 1;
            
            answer++;
            if (answer == 500) {
            	answer = -1;
            	break;
            }
        }
        
        return answer;
    }
	
	// others
	public static int ternary_operator(int num) {
		long n = num;
		for (int i = 0; i < 500; i++) {
			if (n == 1) 
				return i;
			
			n = (n % 2 == 0) ? n / 2 : (n * 3) + 1;
		}
		
		return -1;
	}
}
