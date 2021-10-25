
// 추가기능 : 알람시간 일찍&늦게, 60분 초과, 24시간 초과
// 1440 : 24시간을 분으로 치환 (24x60)

package Baekjoon_step2;

import java.util.*;

public class Q5_2884_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int alarm = -45;	// 음수 : 일찍, 양수 : 늦게
		int timelimit = (H * 60) + M + alarm;
		sc.close();

		if (timelimit < 0) { // 시간이 음수일 때
			if (timelimit < -1440) { // 시간이 음수면서 24시간을 초과할 때
				timelimit = (timelimit % -1440) + 1440;
			} else {
				timelimit += 1440;
			}
		}

		if (timelimit / 60 >= 24) { // 시간이 23:59를 초과할 때
			timelimit %= 1440;
		}

		System.out.println(timelimit / 60 + " " + timelimit % 60);
	}
}
