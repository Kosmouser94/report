/*
 * 미완성
 * 알람시간 일찍, 늦게, 60분 초과
*/

package Baekjoon_step2;

import java.util.*;

public class Q5_2885 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int alarm = 45;
		int result = M + alarm;
		int hr = result / -60;

		if (result < 0) {
			if (H != 0) {
				H -= 1 + hr;
				result += 60;
			} else if (H == 0) {
				H -= 23 + hr;
				result += 60;
			}
		}

		if (result >= 60) {
			if (H != 23) {
				H += hr;
				result -= 60;
			} else if (H == 23) {
				H += hr;
				result -= 60;
			}

		}
		if (H == 24) {
			H = 0;
		} else if (H < 0) {
			H = H * -1;
		}

		if (result < 0) {
			result = result * -1;
		}

		System.out.println(H + " " + result);
	}
}
