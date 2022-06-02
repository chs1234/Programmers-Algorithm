package level1.masked_phone_number;

public class Solution {
	public static void main(String[] args) {
		String result = solution("01012341234");
		
//		String result = solution_substring("01012341234");
//		String result = solution_stringBuilder("01012341234");
//		String result = solution_regexp("01012341234");
		
		System.out.println(result);
	}
	
	// 내가 푼 방법.
	public static String solution(String phone_number) {
        String answer = "";
		for (int i = 0; i < phone_number.length(); i++) {
			if (i < phone_number.length() - 4) 
				answer += "*";
			else 
				answer += phone_number.charAt(i);
		}
        
        return answer;
    }
	
	// substring()을 이용한 방법.
	public static String solution_substring(String phone_number) {
		String answer = "";
		for (int i = 0; i < phone_number.length() - 4; i++) {
			answer += "*";
		}
		
		answer += phone_number.substring(phone_number.length() - 4);
		
		return answer;
	}
	
	// stringBuilder를 이용한 방법.
	public static String solution_stringBuilder(String phone_number) {
		int size = phone_number.length();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < size - 4; i++) {
			sb.append("*");
		}
		
		sb.append(phone_number.substring(size - 4, size));
		
		return sb.toString();
	}
	
	// 정규식을 이용한 방법.
	public static String solution_regexp(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
	}
}
