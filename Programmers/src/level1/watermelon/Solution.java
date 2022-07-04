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
	 * �� char�迭�� �����Ǹ� \0���� ���� ������ �ȴٰ��Ѵ�..
	 * n/2 -> StringIndexOutOfBoundsException �߻�.. expected ���ڼ�, but was ����
	 */
	public String solutionOther(int n) {
		System.out.println("[\\0] ���Կ���: " + new String(new char[n/2 + 1]).contains("\0"));
		System.out.println("str: " + new String(new char[n/2 + 1]).replace("\0", "����"));
		
		return new String(new char[n/2 + 1]).replace("\0", "����").substring(0, n);
	}
	
	public String solution(int n) {
        String answer = "";
        
        for (int i = 0; i < n; i++) {
            answer += (i % 2 == 0) ? "��" : "��";
        }
        
        return answer;
    }
}
