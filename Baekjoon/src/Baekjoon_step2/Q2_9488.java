package Baekjoon_step2;

import java.util.*;

public class Q2_9488 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt(); 
		
		switch(A/10) {
		case 9 : case 10 : System.out.println("A");
		break;
		case 8 : System.out.println("B");
		break;
		case 7 : System.out.println("C");
		break;
		case 6 : System.out.println("D");
		break;
		default : System.out.println("F");
		}

	}

}
