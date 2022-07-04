package level1.string_basic;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solutionOther2("1234"));
		System.out.println(s.solutionOther2("a1234"));
	}
	
	public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) 
        	return false;

        for (int i = 0; i < s.length(); i++) {
        	// (int)'0': 48 / (int)'9': 57
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }
	
	// 예외(NumberFormatException)를 이용한 방법.
	public boolean solutionOther(String s) {
        if(s.length() != 4 && s.length() != 6) 
        	return false;

        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	// regex
	public boolean solutionOther2(String s) {
        if (s.length() == 4 || s.length() == 6) 
        	return s.matches("(^[0-9]*$)");
        
        return false;
	}
}
