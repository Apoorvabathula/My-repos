//Taran Govindu, Tegh Singh, Apoorva Bathula, Abhay Polvarajan, period 2
package lab07;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab07ArrayListAlgorithms {
	
	/**
	 * Returns an Integer that is the maximum value of all the elements in the given ArrayList
	 * @param arrL - an ArrayList of integer values
	 *               Precondition - arrL is not null
	 * @return - an Integer that is the maximum value of elements in arrL
	 */
	public static Integer max (ArrayList<Integer> arrL) {
		if (arrL.size() == 0) return 0;
		int max = arrL.get(0);
		for (int i = 1; i < arrL.size(); i++) {
			if (arrL.get(i) > max) max = arrL.get(i);
		}
		return max;
	}

	/**
	 * Searches the elements of given ArrayList arrL using the linear search approach and returns
	 * the index value of the element whose value matches a given integer value findInt.
	 * @param arrL - an ArrayList of integer values
	 *               Precondition - arrL is not null
	 * @param findInt - an integer value to be searched for in arrL
	 * @return - the index value of findInt in arrL; -1, if not found.
	 */
	public static int search (ArrayList<Integer> arrL, int findInt) {
		if (arrL.size() == 0) return -1;
		for (int i = 0; i < arrL.size(); i++) {
			if (arrL.get(i).equals(findInt)) {
				return i;
			}
		}
		return -1;
	};
	
	/**
	 * Searches the elements of given ArrayList arrL using the linear search approach for
	 * an element whose value matches a given integer value findInt.
	 * If found, removes the element and returns true.
	 * If not found, returns false.
	 * @param arrL - an ArrayList of integer values
	 *               Precondition - arrL is not null
	 * @param findInt - an integer value to be searched for in arrL
	 * @return - true if findInt in arrL; false, if not found.
	 */
	public static boolean searchRemove (ArrayList<Integer> arrL, int findInt) {
		if (arrL.size() == 0) return false;
		for (int i = 0; i < arrL.size(); i++) {
			if (arrL.get(i).equals(findInt)) {
				arrL.remove(i);
				return true;
			}
		}
		return false;
	}

	/**
	 * Goes through the given ArrayList arrL and returns true if at least one prime number is found
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 * @return - true if the list arrL contains at least one prime number; false, otherwise.
	 */
	public static boolean containsAPrimeNumber (ArrayList<Integer> arrL) {
		if (arrL.size() == 0) return false;
		for (Integer val: arrL) {
			int count = 0;
			if (val.equals(2)) return true;
			if (val.equals(1)) count ++;
			for (int i = 2; i < val.intValue(); i++) {
				if (val%i == 0) {
					count ++;
				}
			}
			if (count == 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Goes through the given ArrayList arrL and returns true if all the elements in the given
	 * ArrayList arrL are perfect squares.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 * @return - true if the list arrL is a list of perfect squares; false, otherwise.
	 */
	public static boolean isListOfPerfectSquares (ArrayList<Integer> arrL) {
		if (arrL.size() == 0) return false;
		for (Integer val: arrL) {
			if (Math.sqrt(val) != (int) Math.sqrt(val)) return false;
			
		}
		return true;
	}

	/**
	 * Goes through the given ArrayList arrL and returns true if the list has any duplicate elements.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 * @return - true if the list arrL has duplicate values; false, otherwise.
	 */
	public static boolean hasDuplicates (ArrayList<Integer> arrL) {
		if (arrL.size() == 0) return false;
		for (int i = 0; i < arrL.size()-1; i++) {
			for (int k = i+1; k < arrL.size(); k++) {
				if (arrL.get(i).equals(arrL.get(k))) return true;
			}
		}
		return false; // change this
	}

	/**
	 * Modifies the given ArrayList by rotating all the elements to the right.
	 * The last element becomes the first element; all other elements are shifted to the right.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void rotateRight (ArrayList<Integer> arrL) {
		if (arrL.size() == 0) return;
		int val = arrL.get(arrL.size()-1);
		arrL.remove(arrL.size()-1);
		arrL.add(0, val);
	}
	
	/**
	 * Modifies the given ArrayList by reversing the order of all the elements in the list
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void reverse (ArrayList<Integer> arrL) {
		if (arrL.size() == 0) return;
		for (int i = 0; i < arrL.size() /2 ; i++) {
			int val = arrL.get(i);
			arrL.set(i, arrL.get(arrL.size()-1-i));
			arrL.set(arrL.size()-1-i, val);
		}
	}
	
	/**
	 * Modifies the given ArrayList by sorting the array using insertionSort
	 * Must implement without creating a new ArrayList.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void insertionSort (ArrayList<Integer> arrL) {
		if (arrL.size() == 0) return;
		for (int i = 0; i < arrL.size(); i++) {
			int temp = arrL.get(i);
			int j = i - 1;
			while (j >= 0 && arrL.get(j) > temp) {
				arrL.set(j+1, arrL.get(j));
				j--;
			}
			arrL.set(j+1, temp);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		
		/* test max */
		System.out.println("TESTING max");
		System.out.println("============");
		int maxValue = 0;
		System.out.println("Array List: "+ arrL1);
		maxValue = max(arrL1); System.out.println("The maximum value in this ArrayList is "
				+ maxValue + "; " + (maxValue==50 ? "PASSED!" : "FAILED!"));
		arrL1.set(0,50);arrL1.set(4,10);
		System.out.println("Array List: "+ arrL1);
		maxValue = max(arrL1); System.out.println("The maximum value in this ArrayList is "
				+ maxValue + "; " + (maxValue==50 ? "PASSED!" : "FAILED!"));
		arrL1.set(0,40);arrL1.set(2,50);arrL1.set(3,30);
		System.out.println("Array List: "+ arrL1);
		maxValue = max(arrL1); System.out.println("The maximum value in this ArrayList is "
				+ maxValue + "; " + (maxValue==50 ? "PASSED!" : "FAILED!"));
		System.out.println();
		
		/* test search */
		arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("TESTING search");
		System.out.println("==============");
		System.out.println("Original: "+ arrL1);
		int findThisNumber = 10; int foundIndex = search(arrL1, findThisNumber);
		System.out.println("Looking for element with value " + findThisNumber +
				(foundIndex>=0 ?
				". Found element at index " + foundIndex + "; " + (foundIndex==0 ? "PASSED!" : "FAILED!") : "FAILED"));
		findThisNumber = 20; foundIndex = search(arrL1, findThisNumber);
		System.out.println("Looking for element with value " + findThisNumber +
				(foundIndex>=0 ?
				". Found element at index " + foundIndex + "; " + (foundIndex==1 ? "PASSED!" : "FAILED!") : "FAILED"));
		findThisNumber = 30; foundIndex = search(arrL1, findThisNumber);
		System.out.println("Looking for element with value " + findThisNumber +
				(foundIndex>=0 ?
				". Found element at index " + foundIndex + "; " + (foundIndex==2 ? "PASSED!" : "FAILED!") : "FAILED"));
		findThisNumber = 40; foundIndex = search(arrL1, findThisNumber);
		System.out.println("Looking for element with value " + findThisNumber +
				(foundIndex>=0 ?
				". Found element at index " + foundIndex + "; " + (foundIndex==3 ? "PASSED!" : "FAILED!") : "FAILED"));
		findThisNumber = 50; foundIndex = search(arrL1, findThisNumber);
		System.out.println("Looking for element with value " + findThisNumber +
				(foundIndex>=0 ?
				". Found element at index " + foundIndex + "; " + (foundIndex==4 ? "PASSED!" : "FAILED!") : "FAILED"));
		findThisNumber = 60; foundIndex = search(arrL1, findThisNumber);
		System.out.println("Looking for element with value " + findThisNumber +
				(foundIndex==-1 ? ". Did not find element. PASSED!" : "FAILED!"));
		System.out.println();

		
		/* test searchRemove */
		System.out.println("TESTING searchRemove");
		System.out.println("====================");
		ArrayList<Integer> arrLNo10 = new ArrayList<>(Arrays.asList(20, 30, 40, 50));
		ArrayList<Integer> arrLNo20 = new ArrayList<>(Arrays.asList(10, 30, 40, 50));
		ArrayList<Integer> arrLNo30 = new ArrayList<>(Arrays.asList(10, 20, 40, 50));
		ArrayList<Integer> arrLNo40 = new ArrayList<>(Arrays.asList(10, 20, 30, 50));
		ArrayList<Integer> arrLNo50 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
		arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));		
		boolean foundElement = false;
		// test case #1
		System.out.println("Original: "+ arrL1);
		findThisNumber = 10;
		foundElement = searchRemove(arrL1, findThisNumber);
		System.out.println("Calling searchRemove to find element with value " + findThisNumber +
				". Found and removed " + findThisNumber + ": " + foundElement);
		System.out.println("Modified: "+ arrL1 + "; " + (arrL1.equals(arrLNo10) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		// test case #2
		arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));		
		System.out.println("Original: "+ arrL1);
		findThisNumber = 20;
		foundElement = searchRemove(arrL1, findThisNumber);
		System.out.println("Calling searchRemove to find element with value " + findThisNumber +
				". Found and removed " + findThisNumber + ": " + foundElement);
		System.out.println("Modified: "+ arrL1 + "; " + (arrL1.equals(arrLNo20) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		// test case #3
		arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));		
		System.out.println("Original: "+ arrL1);
		findThisNumber = 30;
		foundElement = searchRemove(arrL1, findThisNumber);
		System.out.println("Calling searchRemove to find element with value " + findThisNumber +
				". Found and removed " + findThisNumber + ": " + foundElement);
		System.out.println("Modified: "+ arrL1 + "; " + (arrL1.equals(arrLNo30) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		// test case #4
		arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));		
		System.out.println("Original: "+ arrL1);
		findThisNumber = 40;
		foundElement = searchRemove(arrL1, findThisNumber);
		System.out.println("Calling searchRemove to find element with value " + findThisNumber +
				". Found and removed " + findThisNumber + ": " + foundElement);
		System.out.println("Modified: "+ arrL1 + "; " + (arrL1.equals(arrLNo40) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		// test case #5
		arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));		
		System.out.println("Original: "+ arrL1);
		findThisNumber = 50;
		foundElement = searchRemove(arrL1, findThisNumber);
		System.out.println("Calling searchRemove to find element with value " + findThisNumber +
				". Found and removed " + findThisNumber + ": " + foundElement);
		System.out.println("Modified: "+ arrL1 + "; " + (arrL1.equals(arrLNo50) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		// test case #6
		arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));		
		ArrayList<Integer> arrAll = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));		
		System.out.println("Original: "+ arrL1);
		findThisNumber = 60;
		foundElement = searchRemove(arrL1, findThisNumber);
		System.out.println("Calling searchRemove to find element with value " + findThisNumber +
				". Found and removed " + findThisNumber + ": " + foundElement);
		System.out.println("Modified: "+ arrL1 + "; " + (arrL1.equals(arrAll) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		System.out.println();

		/* test containsAPrimeNumber */
		//System.out.println(isPrime(101));
		System.out.println("TESTING containsAPrimeNumber");
		System.out.println("============================");
		boolean primeFound = false;
		arrL1 = new ArrayList<>(Arrays.asList(4, 1, 12, 8, 1000));
		//arrL1.add(4);arrL1.add(1);arrL1.add(12);arrL1.add(8);arrL1.add(1000);
		System.out.print(arrL1 + " <-- ");
		primeFound = containsAPrimeNumber(arrL1);
		System.out.println("This array contains a prime number: " + primeFound + "; "
				+ (primeFound==false ? "PASSED!" : "FAILED!"));
		arrL1.add(4,2);
		System.out.print(arrL1 + " <-- ");
		primeFound = containsAPrimeNumber(arrL1);
		System.out.println("This array contains a prime number: " + primeFound + "; "
				+ (primeFound==true ? "PASSED!" : "FAILED!"));
		arrL1.set(4,101);
		System.out.print(arrL1 + " <-- ");
		primeFound = containsAPrimeNumber(arrL1);
		System.out.println("This array contains a prime number: " + primeFound + "; "
				+ (primeFound==true ? "PASSED!" : "FAILED!"));
		arrL1.set(4,1013);
		System.out.print(arrL1 + " <-- ");
		primeFound = containsAPrimeNumber(arrL1);
		System.out.println("This array contains a prime number: " + primeFound + "; "
				+ (primeFound==true ? "PASSED!" : "FAILED!"));
		arrL1.set(4,10139);
		System.out.print(arrL1 + " <-- ");
		primeFound = containsAPrimeNumber(arrL1);
		System.out.println("This array contains a prime number: " + primeFound + "; "
				+ (primeFound==true ? "PASSED!" : "FAILED!"));
		System.out.println();
		
		/* test isListOfPerfectSquares */
		boolean hasOnlyPerfectSquares = false;
		System.out.println("TESTING isListOfPerfectSquares");
		System.out.println("==============================");
		arrL1 = new ArrayList<>(Arrays.asList(1, 4, 9, 16, 26));
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = isListOfPerfectSquares(arrL1);
		System.out.println("This array is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==false ? "PASSED!" : "FAILED"));
		arrL1.set(4,25);
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = isListOfPerfectSquares(arrL1);
		System.out.println("This array is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==true ? "PASSED!" : "FAILED"));
		arrL1.add(625); arrL1.add(169); arrL1.add(1000000); arrL1.add(4096);
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = isListOfPerfectSquares(arrL1);
		System.out.println("This array is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==true ? "PASSED!" : "FAILED"));
		arrL1.add(2048);
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = isListOfPerfectSquares(arrL1);
		System.out.println("This array is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==false ? "PASSED!" : "FAILED"));
		System.out.println();
		
		/* test hasDuplicates */
		System.out.println("TESTING hasDuplicates");
		System.out.println("=====================");
		boolean duplicatesExist = false;
		arrL1 = new ArrayList<>(Arrays.asList(1, 4, 5, 16, 26));
		System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);
		System.out.println("This array has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "FAILED" : "PASSED!"));
		arrL1.set(2,4); System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);
		System.out.println("This array has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "PASSED!" : "FAILED!"));
		arrL1.set(1,1); System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);
		System.out.println("This array has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "PASSED!" : "FAILED!"));
		arrL1.set(1, 2); arrL1.set(4,16); System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);
		System.out.println("This array has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "PASSED!" : "FAILED!"));
		System.out.println();
		
		/* test rotateRight */
		System.out.println("TESTING rotateRight");
		System.out.println("====================");
		arrL1 = new ArrayList<>(Arrays.asList(5, 9, 3, 8, 2, 0, 7, 4, 6, 1));
		System.out.println("Original:      "+arrL1);
		rotateRight(arrL1);
		ArrayList<Integer> expectedArrL1 = new ArrayList<>(Arrays.asList(1, 5, 9, 3, 8, 2, 0, 7, 4, 6));
		System.out.println("Rotated right: "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println();
		
		/* test reverse */
		System.out.println("TESTING reverse");
		System.out.println("===============");
		arrL1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("Original:   "+arrL1);
		reverse(arrL1);
		ArrayList<Integer> expectedArrL2 = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
		System.out.println("Reversed:   "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL2) ? "PASSED!" : "FAILED!"));
		System.out.println();

		/* test insertion sort */
		System.out.println("TESTING insertionSort");
		System.out.println("======================");
		arrL1 = new ArrayList<>(Arrays.asList(5, 9, 3, 8, 2, 0, 7, 4, 6, 1));
		System.out.println("Original: "+arrL1);
		insertionSort(arrL1);
		ArrayList<Integer> expectedArrL3 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL3) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		arrL1 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
		System.out.println("Original: "+arrL1);
		insertionSort(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL3) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		arrL1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("Original: "+arrL1);
		insertionSort(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL3) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		System.out.println();

	}

}