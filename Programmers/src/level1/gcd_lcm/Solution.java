package level1.gcd_lcm;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 12)));
	}
	
	public static int[] solution(int n, int m) {
		int a = Math.max(n, m);
		int b = Math.min(n, m);
		
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		
		return new int[] {a, n * m / a};
	}
}
