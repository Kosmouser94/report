package Baekjoon_step5;

import java.util.Scanner;

public class Q7_4346 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int sum = 0;				// ���� �� �հ�
			int student = sc.nextInt();	// �л� ��
			int[] arr = new int[student];
			for (int j = 0; j < student; j++) {
				int score = sc.nextInt();
				arr[j] = score;			// ���� ����
				sum += arr[j];
			}
			double Avg = 0;				// ���
			int count = 0;				// ����̻� �л���
			Avg = sum / student;
			for (int j = 0; j < student; j++) {
				if (arr[j] > Avg) {
					count++;
				}
			}
			double result = (double) count / student * 100;
			System.out.printf("%.3f%%\n", result);

		}
	}
}
