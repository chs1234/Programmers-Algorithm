package level1.reverse_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solution("Zbcdefg"));
		System.out.println(s.solutionOther1("Zbcdefg"));
		System.out.println(s.solutionOther2("Zbcdefg"));
		System.out.println(s.solutionOther3("Zbcdefg"));
		System.out.println(s.solutionOther4("Zbcdefg"));
	}
	
	public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr, 0, arr.length));

        return sb.reverse().toString();
    }
	
	// ****
	public String solutionOther1(String s) {
        return Stream.of(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }
	
	public String solutionOther2(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(String.valueOf(arr));

        return sb.reverse().toString();
    }
	
	public String solutionOther3(String s) {
		String[] arr = s.split("");
        Arrays.sort(arr,  Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (String a : arr) {
            sb.append(a);
        }

        return sb.toString();
    }
	
	// *****
	public String solutionOther4(String s) {
		 return s.chars().boxed()
			        .sorted(Collections.reverseOrder())
			        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			        .toString();
    }
}
