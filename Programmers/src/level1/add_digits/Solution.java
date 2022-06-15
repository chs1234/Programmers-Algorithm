package level1.add_digits;

public class Solution { 
	public static void main(String[] args) {
		Solution s = new Solution();
		int result = s.solution(987);
		
		System.out.println(result);
	}
	
	public int solution(int n) {
        int answer = 0;
        
        String[] strArr = String.valueOf(n).split("");
        for (int i = 0; i < strArr.length; i++) {
        	answer += Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
	
	public int solution2(int n) {
        int answer = 0;

        while(true) {
            answer += n%10;
            if (n < 10)
                break;

            n = n/10;
        }

        return answer;
    }
}
