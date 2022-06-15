package level1.convert_numbers_into_array;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}

	public static int[] solution(long n) {
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		System.out.println(sb);
		
		String[] array = sb.toString().split("");
		int[] answer = new int[array.length];
		System.out.println(answer.length);
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(array[i]);
		}
		
		return answer;
    }
}
