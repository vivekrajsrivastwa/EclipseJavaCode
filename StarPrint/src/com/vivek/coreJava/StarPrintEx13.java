/*
    print :
          
     *
    * *
   *   *
  *     *
 *       *

    

*/package com.vivek.coreJava;

import java.util.Scanner;

public class StarPrintEx13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++) {
				if(k==1 || k==i*2-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
						
			System.out.println();
		}
		sc.close();
	}

}