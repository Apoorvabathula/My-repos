//Apoorva Bathula, per 2;

import java.util.Scanner;

public class Lab03a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter a paragraph; enter 0 to end the paragraph:");

        while (in.hasNext()){
            
            if ((in.hasNextInt()) && (in.nextInt() == 0))
                break;
            
            in.next();
            counter++;        
        }

        System.out.println("Total number of words: " + counter);
        in.close();
    }
}
/*
Enter your paragraph; enter 0 to end the paragraph:
0
Total number of words = 0


Enter your paragraph; enter 0 to end the paragraph:
Once upon a time there were three little bears. 0
Total number of words = 9


Enter your paragraph; enter 0 to end the paragraph:
Once upon a time there were
three little bears. They lived
happily ever after. 0
Total number of words = 14
appu@Anils-MacBook-Pro ~ % 
 */