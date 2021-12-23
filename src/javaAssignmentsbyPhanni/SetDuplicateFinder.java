package javaAssignmentsbyPhanni;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDuplicateFinder {
	
	public static void main(String[] args) {

		Set<Integer> myFirstSet = new TreeSet<>();

		myFirstSet.add(12);
		myFirstSet.add(11);
		myFirstSet.add(16);
		myFirstSet.add(14);
		myFirstSet.add(5);
		myFirstSet.add(1);
		myFirstSet.add(2);
		myFirstSet.add(3);
		myFirstSet.add(4);
		myFirstSet.add(4);
		myFirstSet.add(4);
		myFirstSet.add(4);

		System.out.println(myFirstSet);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Key:");
		int myRequiredIndex = sc.nextInt();

		// int myRequiredIndex = 3;
		boolean index = false;

		for (int storeSetValues : myFirstSet) {
			if (myFirstSet.contains(myRequiredIndex)) {
				index = true;
				break;
			}
		}
		if (index == true) {
			System.out.println("Duplicate found");

		} else {
			System.out.println("This is new element");
		}
	}

}
