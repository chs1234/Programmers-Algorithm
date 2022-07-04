package level1.find_kim;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
        String[] test = {"Jane", "tiger", "lion", "Kim"};
        Solution s = new Solution();
        
        System.out.println(s.solution(test));
        System.out.println(s.solutionOther(test));
    }

    public String solutionOther(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+ x + "에 있다";
    }
	
	public String solution(String[] seoul) {
        String answer = "김서방은 %s에 있다";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].contains("Kim"))
                answer = String.format(answer, i);
        }

        return answer;
    }
}
