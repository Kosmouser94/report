package Baekjoon_step2;

import java.util.*;

public class Q3_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if (A%4 ==0 && A%100 !=0) {
			System.out.println("1");
		} else if (A%400==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		sc.close();
		
	}

}
