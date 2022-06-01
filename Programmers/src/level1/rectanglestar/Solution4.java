package level1.rectanglestar;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				sb.append("*");
			}
			sb.append("\r\n"); // \r: 맨 앞, \n: 다음줄, \t: 
		}
		
		System.out.println(sb.toString());
	}
}
