package Baekjoon_step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1_10818 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int min = 1000000;
		int max = -1000000;

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int T = Integer.parseInt(st.nextToken());

			if (T > max) {
				max = T;
			}
			if (T < min) {
				min = T;
			}

		}

		System.out.println(min + " " + max);

	}

}
