package Baekjoon_step3;

import java.util.*;

public class Q1_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int time = 1; time < 10; time++) {
			System.out.println(N + " * " + time + " = " + N * time);
		}
	}

}
