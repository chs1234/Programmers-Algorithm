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
        return "�輭���� "+ x + "�� �ִ�";
    }
	
	public String solution(String[] seoul) {
        String answer = "�輭���� %s�� �ִ�";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].contains("Kim"))
                answer = String.format(answer, i);
        }

        return answer;
    }
}
