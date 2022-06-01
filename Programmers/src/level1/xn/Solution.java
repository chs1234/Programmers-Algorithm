package level1.xn;

public class Solution {
	public static void main(String[] args) {
//		long[] result = solution(2, 5);
		long[] result = s(2, 5);

		for (long s : result) {
			System.out.println(s);
		}
	}
	
	public static long[] s(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;
		
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}
		
		return answer;
	}
	
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = x;
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num;
			num += x;
		}
		
		return answer;
	}
}
