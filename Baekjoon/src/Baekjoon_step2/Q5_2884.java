package Baekjoon_step2;

import java.util.Scanner;

public class Q5_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt() - 45;
		sc.close();

		if (M < 0 && H != 0) {
			H--;
			M += 60;
		} else if (M < 0 && H == 0) {
			H += 23;
			M += 60;
		}
		System.out.println(H + " " + M);

	}
}
