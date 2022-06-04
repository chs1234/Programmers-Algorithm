package level1.harshad_number;

public class Solution {
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static boolean s2(int x) {
		String[] temp = String.valueOf(x).split("");

		int sum = 0;
		for (String s : temp) {
			sum += Integer.parseInt(s);
		}

		return x % sum == 0;
	}
	
	public static boolean solution(int x) {
		// x를 마지막에 하샤드 수인지 검사할 때 사용해야 하므로 자리수를 구하며 변경하면 안되므로 n에 x값을 저장.
        int sum = 0;
        int n = x;
        
        // n이 0이 되기 전까지 각 자리수를 sum에 더하고 나누기 10을 하여 자리수를 이동.
        while (n != 0) {
        	sum += n % 10;
        	n = n / 10;
        }
        
        // x가 자리수의 합으로 나누어지는지 나머지 연산으로 검사 후 리턴.
        return x % sum == 0;
    }
}
