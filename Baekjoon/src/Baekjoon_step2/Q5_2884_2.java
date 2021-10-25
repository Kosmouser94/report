/*
 * 알람시간 일찍, 늦게, 60분 초과
*/

package Baekjoon_step2;

import java.util.*;

public class Q5_2885 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int alarm = -45;
		int Time = (H*60) + M + alarm;
	sc.close();
			
			
		if (Time<0) {
			Time += 1440;
		} 

		System.out.println(Time/60 + " " + Time%60);
	}
}
