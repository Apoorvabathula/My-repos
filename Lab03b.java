// Apoorva Bathula, per 2
import java.util.Scanner;

public class Lab03b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        double counter = 0;

        System.out.println("Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence");

        while (in.hasNextInt()){
            total += in.nextInt();
            counter++;
        }

        System.out.println("total: " + total);
        if (counter == 0) System.out.println("There is no average since the set of numbers is empty."); 
        else System.out.println("Average: " + total/counter);

        in.close();
    }
}
/*
 * Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
1 2 3 a
total: 6
Average: 2.0


Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
1
2
3
a
total: 6
Average: 2.0


Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
1 2
3
a
total: 6
Average: 2.0


Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
a
total: 0
There is no average since the set of numbers is empty.


Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
-2 -1 0 11 a
total: 8
Average: 2.0


Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
-2 -1 3 a
total: 0
Average: 0.0


Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
1 2 5 9 a
total: 17
Average: 4.25


Enter numbers to be added up, seperated with a space; then end with any non-numeric1 string of characters to end the sequence
1 2 4 a
total: 7
Average: 2.3333333333333335
appu@Anils-MacBook-Pro ~ % 
 * 
 * 
 */


