package Baekjoon_step5;

import java.util.Scanner;

public class Q4_3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int[] arr = new int[10];
		int div;
		int count = 10;

		for (int i = 0; i < 10; i++) {
			a = sc.nextInt();
			div = a % 42;
			arr[i] = div;

		}

		for (int j = 0; j < 10; j++) {
			for (int t = j + 1; t < 10; t++) {
				if (arr[j] == arr[t]) {
					count--;
					break;
				}
			}
		}

		System.out.println(count);
		sc.close();
	}
}