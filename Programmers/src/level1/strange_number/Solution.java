package level1.strange_number;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String test = "try hello world";
		
		System.out.println(solution(test));
		System.out.println(solution2(test));
	}
	
	public static String solution(String s) {
	    String answer = "";
	    int cnt = 0;
	    String[] array = s.split("");
	
	    for(String ss : array) {
	        cnt = ss.contains(" ") ? 0 : cnt + 1;
	        answer += (cnt % 2 == 0) ? ss.toLowerCase() : ss.toUpperCase(); 
	    }
        
	    return answer;
	}
	
	public static String solution2(String s) {
		char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                idx = 0;
            else
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
        }

        return String.valueOf(chars);
	}
}
