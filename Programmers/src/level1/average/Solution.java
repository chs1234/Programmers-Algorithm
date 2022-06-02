package level1.average;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4};
		
		double result = solution(array);
//		double result = solution_ArrayStream(array);
		
		System.out.println(result);
	}
	
	public static double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }
        
        return answer / arr.length;
    }

	public static double solution_ArrayStream(int[] arr) {
	    return (double) Arrays.stream(arr).average().orElse(0);
	}
}
