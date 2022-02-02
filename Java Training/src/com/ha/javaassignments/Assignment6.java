package com.ha.javaassignments;

public class Assignment6 {

	public static void main(String[] args) {
		// Print binary triangle
		
		int m=5;
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<=i;j++) {
				if((j+i)%2==0) {
					System.out.print(0);
				}else
					System.out.print(1);
			}
			System.out.print("\n");
		}

	}

}
