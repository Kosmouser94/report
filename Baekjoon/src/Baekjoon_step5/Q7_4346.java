package Baekjoon_step5;

import java.util.Scanner;

public class Q7_4346 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
			int sum = 0;				// 성적 총 합계
			int student = sc.nextInt();		// 학생 수
			int[] arr = new int[student];
			for (int j = 0; j < student; j++) {
				int score = sc.nextInt();
				arr[j] = score;			// 시험 점수
				sum += arr[j];
			}
			double Avg = 0;				// 평균
			int count = 0;				// 평균이상 학생수
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
