package Baekjoon_step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Q11_10871_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			StringTokenizer kt = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(kt.nextToken());
			if (V < X) {
				bw.write(V);
			}

		}
		bw.close();

	}

}
