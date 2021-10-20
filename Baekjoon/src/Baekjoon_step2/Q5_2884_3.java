// 초안보다 안좋음

package Baekjoon_step2;

import java.util.Scanner;

public class Q5_2886 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt() - 45;
		sc.close();

		if (M < 0) {
			M += 60;
			if (H != 0) {
				H--;
			} else {
				H += 23;
			}
		}
		System.out.println(H + " " + M);

	}
}
