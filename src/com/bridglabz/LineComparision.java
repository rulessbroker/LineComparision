package com.bridglabz;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparision Computation Program\n\n");

		System.out.println("Enter points for first line:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter point x1: ");
		int x1 = sc.nextInt();
		System.out.println("Enter point y1: ");
		int y1 = sc.nextInt();
		System.out.println("Enter point x2: ");
		int x2 = sc.nextInt();
		System.out.println("Enter point y2: ");
		int y2 = sc.nextInt();
		Double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println("Length of first line: " + length1);

		System.out.println("\nEnter points for second line:");
		System.out.println("Enter point x3: ");
		int x3 = sc.nextInt();
		System.out.println("Enter point y3: ");
		int y3 = sc.nextInt();
		System.out.println("Enter point x4: ");
		int x4 = sc.nextInt();
		System.out.println("Enter point y4: ");
		int y4 = sc.nextInt();
		Double length2 = Math.sqrt((Math.pow((x4 - x3), 2)) + (Math.pow((y4 - y3), 2)));
		System.out.println("Length of second line is: " + length2);
		System.out.println();

		int result = length2.compareTo(length1);

		if (result == 0) {
			System.out.println("\nLines are equal");
		} else if (result > 0) {
			System.out.println("\nLine 2 is greater than line 1");
		} else {
			System.out.println("\nline 1 is greater than line 2");
		}
	}
}
