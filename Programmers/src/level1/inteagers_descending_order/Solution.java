package level1.inteagers_descending_order;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static void main(String[] args) {
		// 118732 -> 873211
		System.out.println(solution(118732));
	}
	
	public static long solution(long n) {
		String[] temp = String.valueOf(n).split("");
		Arrays.sort(temp, Comparator.reverseOrder());
		String num = "";
		
		for (String s : temp) {
			num += s;
		}
		
        return Long.parseLong(num);
    }
	
	public static long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
	}
}
