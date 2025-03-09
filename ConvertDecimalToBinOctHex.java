/*
 * Your name: Apoorva Bathula
 * Your team members' names: absent so no team
 * 
 * Class: ConvertDecimalToBinOctHex
 * 
 * IMPLEMENTATION:
 * This class includes methods decToHex, decToBin, and decToOct, to convert
 * convert decimal whole numbers to binary, octal, and hexadecimal.
 * Currently these methods are not yet implemented.
 * Your job is to implement these methods.
 * 
 * INITIAL TESTING:
 * Your output should test for the 5 test cases provided in the comment section
 * section at the bottom of this class. Create 3 more test cases of your own
 * and paste the contents of the console window for those 3 test cases at the
 * bottom of this java file under Test Case 6, 7, and 8.
 * 
 * ADDITIONAL TESTING:
 * Change the name of the main method to main1.
 * Change the name of the method main2 to main;
 * Now run the automated suite and get all 150 test cases to run without error.
 * 
 * RUBRIC:
 * Go through the attached rubric before finalizing your code.
 * 
 * SUBMITTING:
 * Submit your code with the main method that runs the automated test suite.
 */

import java.util.Scanner;

public class ConvertDecimalToBinOctHex {
    
    /* Given a decimal integer value via parameter num, return a String
     * containing the equivalent hexadecimal value.
     * Assume num >= 0.
     * Complete this implementation.
     */
    public static String decToHex (int num) {
        if (num == 0) return "0";
        String ans = "";
        while (num >= 1) {
            int digit = num % 16;
            
            if (digit < 10) ans = digit + ans;
            else if (digit == 10)
                ans = "A" + ans;
            else if (digit == 11)
                ans = "B" + ans;    
            else if (digit == 12)
                ans = "C" + ans;
            else if (digit == 13)
                ans = "D" + ans;
            else if (digit == 14)
                ans = "E" + ans;
            else if (digit == 15) 
                ans = "F" + ans;
            
            num /= 16;
        } 
        return ans;
    }
    
    /* Given a decimal integer value via parameter num, return a String
     * containing the equivalent binary value.
     * Assume num >= 0.
     * Complete this implementation.
     */
    public static String decToBinary (int num) {
        if (num == 0) return "0";
        String ans = "";
        while (num >= 1) {
            ans = (num % 2) + ans;
            num /= 2;
        } 
        return ans;
    }

    /* Given a decimal integer value via parameter num, return a String
     * containing the equivalent octal value.
     * Assume num >= 0.
     * Complete this implementation.
     */
    public static String decToOctal (int num) {
        if (num == 0) return "0"; 
        String ans = "";
        while (num >= 1) {
            ans = (num % 8) + ans;
            num /= 8;
        }
        return ans;
    }

    /******************************************************************/
    /** MAIN PROGRAM #1 for Ms. Sangam's Basic Testing using Scanner **/
    /******************************************************************/

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal whole number (0 or positive integer): ");
        int num = scan.nextInt();
                
        System.out.println("Binary value: " + decToBinary(num));
        System.out.println("Octal value: " + decToOctal(num));
        System.out.println("Hexadecimal value: " + decToHex(num));
        
        scan.close();
    }

    /***********************************************************/
    /** MAIN PROGRAM #2 for Ms. Sangam's Automated Test Suite **/
    /***********************************************************/

    public static void main(String[] args) {
        
        int[] decArray =
                new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                        30, 44, 445, 971,
                        1024, 1025, 1026, 1027, 1028, 1029, 1030, 1031,
                        1032, 1033, 1034, 1035, 1036, 1037, 1038, 1039, 1040,
                        1294, 2703, 41977,
                        1073741824, 1073741825, 1073741826, 1073741827,
                        1073741828, 1073741829, 1073741830, 1073741831,
                        2147483647};
        String[] expectedBinArray =
                new String[] {"0", "1", "10", "11", "100", "101", "110", "111", "1000", "1001",
                        "1010", "1011", "1100", "1101", "1110", "1111", "10000", "11110",
                        "101100", "110111101", "1111001011",
                        "10000000000", "10000000001", "10000000010", "10000000011",
                        "10000000100", "10000000101", "10000000110", "10000000111",
                        "10000001000", "10000001001", "10000001010", "10000001011",
                        "10000001100", "10000001101", "10000001110", "10000001111", "10000010000",
                        "10100001110", "101010001111", "1010001111111001",
                        "1000000000000000000000000000000", "1000000000000000000000000000001",
                        "1000000000000000000000000000010", "1000000000000000000000000000011",
                        "1000000000000000000000000000100", "1000000000000000000000000000101",
                        "1000000000000000000000000000110", "1000000000000000000000000000111",
                        "1111111111111111111111111111111"};
        String[] expectedOctArray =
                new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "10", "11", "12",
                        "13", "14", "15", "16", "17", "20", "36", "54", "675", "1713",
                        "2000", "2001","2002","2003","2004","2005","2006","2007",
                        "2010", "2011","2012","2013","2014","2015","2016","2017","2020",
                        "2416", "5217", "121771",
                        "10000000000", "10000000001", "10000000002", "10000000003",
                        "10000000004", "10000000005", "10000000006", "10000000007",
                        "17777777777"};
        String[] expectedHexArray =
                new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D",
                        "E", "F", "10", "1E", "2C", "1BD",  "3CB",
                        "400", "401", "402", "403", "404", "405", "406", "407",
                        "408", "409", "40A", "40B", "40C", "40D", "40E", "40F", "410",
                        "50E", "A8F", "A3F9",
                        "40000000", "40000001", "40000002", "40000003",
                        "40000004", "40000005", "40000006", "40000007",
                        "7FFFFFFF"};

        int pass = 0;
        int passWLeadingZeros = 0;
        int passWSpaces= 0;
        int fail=0;
        for (int i=0; i<decArray.length; i++) {
            
            String bin = decToBinary(decArray[i]);
            String oct = decToOctal(decArray[i]);
            String hex = decToHex(decArray[i]);
            
            System.out.println("Test case " + (i+1) + ": Decimal = " + decArray[i]);
            
            System.out.print("Binary: expected = " + expectedBinArray[i]);
            System.out.print("; result = " + bin + ". ");
            if (expectedBinArray[i].equals(bin)) {
                pass++;
                System.out.println("PASS :-)");
            }
            else if (expectedBinArray[i].equals(stripLeadingZeros(bin))) {
                passWLeadingZeros++;
                System.out.println("PASS w/ leading 0s removed:-|");                
            }
            else if (expectedBinArray[i].equals(bin.replaceAll("\\s+", ""))) {
                passWSpaces++;
                System.out.println("PASS w/ spaces removed :-|");               
            }
            else {
                fail++;
                System.out.println("FAIL! :-(");
            }
            
            System.out.print("Octal: expected = " + expectedOctArray[i]);
            System.out.print("; result = " + oct + ". ");
            if (expectedOctArray[i].equals(oct)) {
                pass++;
                System.out.println("PASS! :-)");
            }
            else if (expectedOctArray[i].equals(stripLeadingZeros(oct))) {
                passWLeadingZeros++;
                System.out.println("PASS w/ leading 0s removed:-|");                
            }
            else if (expectedOctArray[i].equals(oct.replaceAll("\\s+", ""))) {
                passWSpaces++;
                System.out.println("PASS w/ spaces removed :-|");               
            }
            else {
                fail++;
                System.out.println("FAIL! :-(");
            }

            System.out.print("Hexadecimal: expected = " + expectedHexArray[i]);
            System.out.print("; result = " + hex + ". ");
            if (expectedHexArray[i].equals(hex)) {
                pass++;
                System.out.println("PASS! :-)");
            }
            else if (expectedHexArray[i].equals(stripLeadingZeros(hex))) {
                passWLeadingZeros++;
                System.out.println("PASS w/ leading 0s removed:-|");                
            }
            else if (expectedHexArray[i].equals(hex.replaceAll("\\s+", ""))) {
                passWSpaces++;
                System.out.println("PASS w/ spaces removed :-|");               
            }
            else {
                fail++;
                System.out.println("FAIL! :-(");
            }
            
            System.out.println("----------");
        }
        
        int max = decArray.length;
        double overallScore = pass + 0.9*passWLeadingZeros + 0.9*passWSpaces;
        System.out.println("FYI: 90% credit for each case that passes with extra spaces or leading zeros.");
        System.out.print("PASS: " + pass + "; PASS w/ Leading Zeros: " + passWLeadingZeros + "; ");
        System.out.print("PASS w/ Spaces: " + passWSpaces +"; ");
        System.out.println("FAIL: " + fail +".");
        System.out.print("OVERALL score = " + (overallScore) + "/" + (max*3));
        System.out.printf(" = %2.2f/30\n", (overallScore)/5.0);
    }

    public static String stripLeadingZeros (String str) {
        if (str==null || str.length()==0) return str;
        int i = 0;
        while (i<str.length() && str.substring(i,i+1).equals("0")) {
            i++;
        }
        if (i==str.length()) return "0";
        else return str.substring(i);
    }

}
/*

+++++++++++
TEST CASE 1
+++++++++++
Enter a decimal whole number (0 or positive integer): 0
Binary value: 0
Octal value: 0
Hexadecimal value: 0

+++++++++++
TEST CASE 2
+++++++++++
Enter a decimal whole number (0 or positive integer): 13
Binary value: 1101
Octal value: 15
Hexadecimal value: D

+++++++++++
TEST CASE 3
+++++++++++
Enter a decimal whole number (0 or positive integer): 30
Binary value: 11110
Octal value: 36
Hexadecimal value: 1E

+++++++++++
TEST CASE 4
+++++++++++
Enter a decimal whole number (0 or positive integer): 971
Binary value: 1111001011
Octal value: 1713
Hexadecimal value: 3CB

+++++++++++
TEST CASE 5
+++++++++++
Enter a decimal whole number (0 or positive integer): 2703
Binary value: 101010001111
Octal value: 5217
Hexadecimal value: A8F

+++++++++++
TEST CASE 6
+++++++++++
Enter a decimal whole number (0 or positive integer): 38381
Binary value: 1001010111101101
Octal value: 112755
Hexadecimal value: 95ED

+++++++++++
TEST CASE 7
+++++++++++
Enter a decimal whole number (0 or positive integer): 838332
Binary value: 11001100101010111100
Octal value: 3145274
Hexadecimal value: CCABC

+++++++++++
TEST CASE 8
+++++++++++
Enter a decimal whole number (0 or positive integer): 22
Binary value: 10110
Octal value: 26
Hexadecimal value: 16

*/