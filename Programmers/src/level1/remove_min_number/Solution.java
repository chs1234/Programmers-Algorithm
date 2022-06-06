package level1.remove_min_number;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		// [4, 3, 2, 1] -> [4, 3, 2]
		// [10] -> [-1]
		int[] test = {5, 10, 39};
//		Arrays.stream(test).sorted().forEach(s -> System.out.println(s));

		System.out.println(Arrays.toString(solution(test)));
		System.out.println(Arrays.toString(stream(test)));
	}
	
	public static int[] stream(int[] arr) {
		if (arr.length <= 1) return new int[] {-1};
		int min = Arrays.stream(arr).min().getAsInt();
		
		return Arrays.stream(arr).filter(i -> i != min).toArray();
	}
	
	public static int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}
			
		int[] copyArr = arr.clone();
		Arrays.sort(copyArr);
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < copyArr.length; i++) {
			if (arr[i] != copyArr[0])
				list.add(arr[i]);
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
