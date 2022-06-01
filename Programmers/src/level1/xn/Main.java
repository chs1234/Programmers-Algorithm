package level1.xn;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solutions solutions = new Solutions();
		long[] result = solutions.solution(-4, 2);
		long[] result2 = solutions.solution2(-4, 2);
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
	}

}
