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
		// x�� �������� �ϻ��� ������ �˻��� �� ����ؾ� �ϹǷ� �ڸ����� ���ϸ� �����ϸ� �ȵǹǷ� n�� x���� ����.
        int sum = 0;
        int n = x;
        
        // n�� 0�� �Ǳ� ������ �� �ڸ����� sum�� ���ϰ� ������ 10�� �Ͽ� �ڸ����� �̵�.
        while (n != 0) {
        	sum += n % 10;
        	n = n / 10;
        }
        
        // x�� �ڸ����� ������ ������������ ������ �������� �˻� �� ����.
        return x % sum == 0;
    }
}
