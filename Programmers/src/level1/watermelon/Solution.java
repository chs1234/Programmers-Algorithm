package level1.watermelon;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();

//		System.out.println(s.solution(3));
//		System.out.println(s.solution(4));
		
		System.out.println(s.solutionOther(3));
		System.out.println(s.solutionOther(4));
	}
	
	/*
	 * 빈 char배열이 생성되면 \0으로 먼저 생성이 된다고한다..
	 * n/2 -> StringIndexOutOfBoundsException 발생.. expected 수박수, but was 수박
	 */
	public String solutionOther(int n) {
		System.out.println("[\\0] 포함여부: " + new String(new char[n/2 + 1]).contains("\0"));
		System.out.println("str: " + new String(new char[n/2 + 1]).replace("\0", "수박"));
		
		return new String(new char[n/2 + 1]).replace("\0", "수박").substring(0, n);
	}
	
	public String solution(int n) {
        String answer = "";
        
        for (int i = 0; i < n; i++) {
            answer += (i % 2 == 0) ? "수" : "박";
        }
        
        return answer;
    }
}
