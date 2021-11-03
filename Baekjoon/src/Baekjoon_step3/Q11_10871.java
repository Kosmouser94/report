package Baekjoon_step3;

import java.util.Scanner;

public class Q11_10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int V = sc.nextInt();
			if (V < X) {
				System.out.println(V);
			}

		}
		sc.close();

	}

}