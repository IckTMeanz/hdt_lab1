package b63;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int numStar=0;
		for(int i=0; i<h; i++) {
			
			for(int k=0; k<h-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=numStar; j++) {
				System.out.print("*");
			}
			System.out.println();
			numStar+=2;
		}
	}
}
