package com.bridglabz;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparision Computation Program\n\n");

		System.out.println("Enter points for line:");
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
		System.out.println("Length of line: " + length1);
	}
}
