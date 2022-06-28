package level1.string_to_integer;

public class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		System.out.println(solution.getStrToInt("1234"));
		System.out.println(solution.getStrToInt("-1234"));
	}
	
	// 내 풀이.
	public int solution(String s) {
		return Integer.parseInt(s);
	}
	
	// 다른 사람 풀이.
	// 아스키 코드표에서 문자열 0은 80, 문자열 1은 81... 문자열을 아스키코드로 계산, 빼면 숫자가 나온다는 뜻
	 public int getStrToInt(String str) {
         boolean Sign = true;
         int result = 0;

         for (int i = 0; i < str.length(); i++) {
	         char ch = str.charAt(i);
	         if (ch == '-') {
	        	 Sign = false;
	         }
	         else if(ch !='+') {
	        	 result = result * 10 + (ch - '0');
	         }
	             
	     }
         
	     return (Sign ? 1 : -1) * result;
	 }
}
