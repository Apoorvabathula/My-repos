//Name: Apoorva Bathula, per 2

public class NumberSequencesAndSeries {
	public static void main(String[] args) {
	
		int counter = 0;
		for (int i = 1; i<=100; i++) {
			counter+=i;
		}
		
		System.out.println("The sum of all numbers between 1 and 100 (inclusive) is: " + counter);
	
		int counterOne = 0;
		for (int i = 1002; i<=2000; i=i+2) {
			counterOne+=i;
		
		}
		System.out.println("The sum of all even numbers between 1002 and 2000 (inclusive) is: " + counterOne);
	

		int counterTwo = 0;
		for (int i = 1; i<=10; i++)
		{
			counterTwo+= Math.pow(i, 2);
		}
		System.out.println("The sum of the squares of all numbers between 1 and 10 (inclusive) is: "+counterTwo);

		System.out.print("The powers of 3 from 3^0 to 3^10 are: ");
		for (int i = 0; i<=10; i++) {
			if (i == 10) {
				System.out.println((int) Math.pow(3, i));
			}
			else {
				System.out.print((int) Math.pow(3, i) + ", ");
			}
		}
	}

}
/*
 * The sum of all numbers between 1 and 100 (inclusive) is: 5050
The sum of all even numbers between 1002 and 2000 (inclusive) is: 750500
The sum of the squares of all numbers between 1 and 10 (inclusive) is: 385
The powers of 3 from 3^0 to 3^10 are: 1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049
 */