package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Num_2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] rope = new int[N];
		int total = 0;
		
		for(int i = 0 ; i < N ; i++)
			rope[i] = sc.nextInt();
		
		int ropeMin = Arrays.stream(rope).min().getAsInt();
		
		while((total / N) < ropeMin)
			total += 1;

		System.out.print(total);
		sc.close();
	}

}
