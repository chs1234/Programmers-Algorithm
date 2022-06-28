package level1.string_to_integer;

public class Solution {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		System.out.println(solution.getStrToInt("1234"));
		System.out.println(solution.getStrToInt("-1234"));
	}
	
	// �� Ǯ��.
	public int solution(String s) {
		return Integer.parseInt(s);
	}
	
	// �ٸ� ��� Ǯ��.
	// �ƽ�Ű �ڵ�ǥ���� ���ڿ� 0�� 80, ���ڿ� 1�� 81... ���ڿ��� �ƽ�Ű�ڵ�� ���, ���� ���ڰ� ���´ٴ� ��
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
