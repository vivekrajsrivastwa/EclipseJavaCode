package com.vivek.coreJava;

import java.util.Scanner;

public class StarPrintEx9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=num;k>=i;k--) {
			System.out.print(" *");
		}
		System.out.println();
	}
	sc.close();
	}

}
