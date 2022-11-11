package com.bridglabz;

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparision Computation Program\n\n");

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter values for x1,y1 and x2,y2 of line1");
		Point p1 = new Point(scanner.nextInt(), scanner.nextInt());
		Point p2 = new Point(scanner.nextInt(), scanner.nextInt());
		Line line1 = new Line(p1, p2);
		Float length1 = line1.getLength();

		System.out.println("enter values for x1,y1 and x2,y2 of line2");
		Point p3 = new Point(scanner.nextInt(), scanner.nextInt());
		Point p4 = new Point(scanner.nextInt(), scanner.nextInt());
		Line line2 = new Line(p3, p4);
		Float length2 = line2.getLength();

		System.out.println("Length of line1 = " + length1);
		System.out.println("Length of line2 = " + length2);

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
