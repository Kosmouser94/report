/*
 * 알람시간 일찍, 늦게, 60분 초과
*/

package Baekjoon_step2;

import java.util.*;

public class Q5_2884_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int alarm = -45;
		int Time = (H * 60) + M + alarm;
		sc.close();

		if (Time < 0) { // 시간이 음수일 때
			if (Time < -1440) { // 시간이 음수면서 24시간을 초과할 때
				Time = (Time % -1440) + 1440;
			} else {
				Time += 1440;
			}
		}

		if (Time > 1440 || Time / 60 == 24) { // 시간이 23:59를 초과할 때
			Time %= 1440;
		}

		System.out.println(Time / 60 + " " + Time % 60);
	}
}
