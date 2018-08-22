package com.test.CodeJam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrowserCheck {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of cases:");
		
		int casesNum = sc.nextInt();
		
		System.out.println("Enter the NUMBER of browsers:");
		
		int browserNum = sc.nextInt();
		
		System.out.println("Enter the browsers");
		
		for(int i =0; i<browserNum; i++) {
			List<String> browserList = new ArrayList<String>();
			
			browserList.add(sc.nextLine());
			//Testing
			System.out.println(browserList);
			
		}
		
System.out.println("Enter the NUMBER of queries:");
		
		int querieNum = sc.nextInt();
		
		System.out.println("Enter the queries");
		
		for(int i =0; i<querieNum; i++) {
			List<String> querieList = new ArrayList<String>();
			
			querieList.add(sc.nextLine());
			//Testing
			
		}
	}
}
