package level1.xn;

public class Solutions {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;
		
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] + x;
		}
		
		return answer;
	}
	
	public long[] solution2(int x, int n) {
		long[] answer = new long[n];
		long num = x;
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num;
			num += x;
		}
		
		return answer;
	}
}
