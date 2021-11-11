package Baekjoon_step5;

import java.util.Scanner;

public class Q5_1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int many = sc.nextInt();
		double[] n = new double[many];
		double m = 0;
		double sum = 0;
		double avr;

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if (n[i] > m) {
				m = n[i];
			}

		}

		for (int j = 0; j < n.length; j++) {
			n[j] = n[j] / m * 100;
			sum += n[j];
		}

		avr = sum / many;
		System.out.println(avr);

	}

}
