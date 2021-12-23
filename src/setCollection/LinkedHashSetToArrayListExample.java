package setCollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetToArrayListExample {
	public static void main(String[] args) {

		LinkedHashSet<Integer> lhSetEvenNumbers = new LinkedHashSet<Integer>();

		lhSetEvenNumbers.add(2);
		lhSetEvenNumbers.add(4);
		lhSetEvenNumbers.add(6);
		lhSetEvenNumbers.add(8);
		lhSetEvenNumbers.add(10);
		
		System.out.println("Linked Hash Set contains: " + lhSetEvenNumbers);

		// using ArrayList constructor
		List<Integer> list = new ArrayList<Integer>(lhSetEvenNumbers);

		System.out.println("ArrayList contains: " + list);
	}

}
