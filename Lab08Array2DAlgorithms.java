package lab08;

import java.util.Arrays;

public class Lab08Array2DAlgorithms {

	/** PRINT 2D ARRAY
	 * Prints the 2D array neatly, as shown in the comments at the bottom
	 * of this file.
	 * @param matrix1 (m by n 2D array)
	 * @return a new matrix (m by q 2D array)
	 */
	private static void print2D(int[][] matrix) {
        // Loop through all rows
		System.out.print("  [");
        for (int i = 0; i < matrix.length; i++) {
        	if (i==0) System.out.print("[");
        	else System.out.print("   [");
            // Loop through all elements of current row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j != matrix[0].length-1) System.out.print(", ");
            }
        	if (i!=matrix.length-1) System.out.println("],");
        	else System.out.print("]]");
        }
        System.out.println();
    }
 

	/** EXERCISE 8-A:
	 * Return a 2D array containing the powers of x^y, where 0 <= x <= a and 0 <= y <= b
	 * @param a - an integer value that is the highest base of the expression x^y
	 * @param b - an integer value that is the highest exponent of the expression x^y
	 * @return - a 2D array that contains the powers of x^y, where 0 <= x <= a and 0 <= y <= b.
	 */
	public static int[][] xPowerYTable (int a, int b) {
		int[][] res = new int[a + 1][b + 1];
		for (int x = 0; x <= a; x++) {
			for (int y = 0; y <= b; y++) {
				res[x][y] = (int) Math.pow(x, y);
			}
		}
		return res;
	}
	/** EXERCISE 8-B:
	 * Return a 2D array containing the powers of x^y, where 0 <= x <= a and 0 <= y <= b
	 * @param arr - a 2D array
	 * @return - a new 2D array that contains the values of array arr transposed
	 */
	public static int[][] transpose(int[][] arr) {
		int rows = arr.length;
    int cols = arr[0].length;
    int[][] res2 = new int[cols][rows];
    for (int q = 0; q < rows; q++) {
        for (int w = 0; w < cols; w++) {
            res2[w][q] = arr[q][w];
        }
    }
    return res2;
}
	
	/** EXERCISE 8-C: return a new matrix that is the dot product of the matrices passed in as parameters
	 * @param matrix1 (m by n matrix)
	 * @param matrix2 (n by q matrix)
	 * precondition: the number of columns in matrix1 matches
	 *   the number of rows in matrix2
	 * @return a new matrix that contains the dot product of matrix1 and matrix2 (m by q)
	 */
	public static int[][] dotProduct (int[][]matrix1, int[][]matrix2) {
		int mtrx = matrix1.length;
    int ntrx = matrix2[0].length;
    int[][] res3 = new int[mtrx][ntrx];
    for (int v = 0; v < mtrx; v++) {
        for (int b = 0; b < ntrx; b++) {
            for (int c = 0; c < matrix1[0].length; c++) {
                res3[v][b] += matrix1[v][c] * matrix2[c][b];
            }
        }
    }
    return res3;
}
	/** EXERCISE 8-D: return a 1-d array containing the sum of all the elements in each row of the 2d array passed in as a parameter
	 * @param matrix (a 2D array)
	 * @return: a 1-d array containing the sum of all the elements in each row of the 2d array passed in as a parameter
	 * precondition: the matrix has at least 1 row and 1 column. It is a rectangular matrix.
	 * Note: It does not have to be a square matrix.
	 */
	public static int[] rowSums(int[][] matrix) {
		int[] res4 = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            res4[i] += matrix[i][j];
        }
    }
    return res4;
}
	
	
	/** EXERCISE 8-E: return a 1-d array containing the sum of all the elements in each column of the 2d array passed in as a parameter
	 * @param matrix (a 2D array)
	 * @return: a 1-d array containing the sum of all the elements in each column of the 2d array passed in as a parameter
	 * precondition: the matrix has at least 1 row and 1 column. It is a rectangular matrix.
	 * Note: It does not have to be a square matrix.
	 */
	public static int[] colSums(int[][] matrix) {
		int[] res5 = new int[matrix[0].length];
    for (int j = 0; j < matrix[0].length; j++) {
        for (int i = 0; i < matrix.length; i++) {
            res5[j] += matrix[i][j];
        }
    }
    return res5;
}
	
	/** EXERCISE 8-F
	 * Modifies the original array; rotates all values clockwise along the outer edges of
	 * the matrix
	 * @param mat the array
	 * 
	 * precondition: the matrix has at least 2 rows and 2 columns. It is a rectangular matrix.
	 * Note: It does not have to be a square matrix.
	 *
	 * Example:
	 * matrix before the call
	 * 10  9   8   7
	 * 6   5   4   3
	 * 2   1   0  -1
	 *
	 * matrix before the call:
	 * 6  10   9   8
	 * 2   5   4   7
	 * 1   0  -1   3
	 */
	public static void rotateClockwise(int[][] mat) {
		int top = 0, bottom = mat.length - 1;
		int left = 0, right = mat[0].length - 1;
	
		while (top < bottom && left < right) {
			int previous = mat[top + 1][left];
			for (int i = left; i <= right; i++) {
				int temporary = mat[top][i];
				mat[top][i] = previous;
				previous = temporary;
			}
			top++;
	
			for (int i = top; i <= bottom; i++) {
				int temporary = mat[i][right];
				mat[i][right] = previous;
				previous = temporary;
			}
			right--;
	
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					int temporary = mat[bottom][i];
					mat[bottom][i] = previous;
					previous = temporary;
				}
				bottom--;
			}
	
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					int temporary = mat[i][left];
					mat[i][left] = previous;
					previous = temporary;
				}
				left++;
			}
		}
	}

	/********************************************************************/
	/*********************** BEGIN MAIN PROGRAM *************************/
	/********************************************************************/

	public static void main(String[] args) {
		
		int successes = 0;
		int failures = 0;
		
		System.out.println("=======================================");
		System.out.println("  Testing EXERCISE 8-A: xPowerYTable");
		System.out.println("=======================================");
		int a = 8;
		int b = 7;
		int[][] arr11 = xPowerYTable(a,b);
		if (arr11!=null) {
			System.out.println("With a=" + a + " and b=" + b +
					": Table showing a^b values, where 0<=x<=a and 0<=y<=b: ");
			int[][] arr11Expected =
			  {{1, 0, 0, 0, 0, 0, 0, 0},
			   {1, 1, 1, 1, 1, 1, 1, 1},
			   {1, 2, 4, 8, 16, 32, 64, 128},
			   {1, 3, 9, 27, 81, 243, 729, 2187},
			   {1, 4, 16, 64, 256, 1024, 4096, 16384},
			   {1, 5, 25, 125, 625, 3125, 15625, 78125},
			   {1, 6, 36, 216, 1296, 7776, 46656, 279936},
			   {1, 7, 49, 343, 2401, 16807, 117649, 823543},
			   {1, 8, 64, 512, 4096, 32768, 262144, 2097152}};
			System.out.println("Expected result for arr11:");
			print2D(arr11Expected);
			System.out.println("Your result for arr11:");
			print2D(arr11);
			System.out.println();
			if (Arrays.deepEquals(arr11, arr11Expected))
				{System.out.println("8-A arr11: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-A arr11: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-A: xPowerYTable NOT YET IMPLEMENTED"); failures++;
		}
			
		System.out.println("=======================================");
		System.out.println("  Testing EXERCISE 8-B: transpose");
		System.out.println("=======================================");

		int[][] arr21 = { {11, 12, 13}, {21, 22, 23} };
		int[][] arr21Transposed = transpose(arr21);
		if (arr21Transposed != null) {
			int[][] arr21TransposedExpected = {{11, 21}, {12, 22}, {13, 23}};
			System.out.println("arr21:");
			print2D(arr21);
			System.out.println("Expected result for arr21Transposed:");
			print2D(arr21TransposedExpected);
			System.out.println("Your result for arr21Transposed:");
			print2D(arr21Transposed);
			System.out.println();
			if (Arrays.deepEquals(arr21Transposed, arr21TransposedExpected))
				{System.out.println("8-B arr21: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-B arr21: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-B: transpose NOT YET IMPLEMENTED"); failures++;
		}

		int[][] arr22 = { {11, 12, 13, 14, 15}, {21, 22, 23, 24, 25}, {31, 32, 33, 34, 35} };
		int[][] arr22Transposed = transpose(arr22);
		if (arr22Transposed != null) {
			int[][] arr22TransposedExpected = {{11, 21, 31}, {12, 22, 32}, {13, 23, 33}, {14, 24, 34}, {15, 25, 35}};			
			System.out.println("arr22:");
			print2D(arr22);
			System.out.println("Expected result for arr22Transposed:");
			print2D(arr22TransposedExpected);
			System.out.println("Your result for arr22Transposed:");
			print2D(arr22Transposed);
			System.out.println();
			if (Arrays.deepEquals(arr22Transposed, arr22TransposedExpected))
				{System.out.println("8-B arr22: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-B arr22: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-B: transpose NOT YET IMPLEMENTED"); failures++;
		}
		

		int[][] arr23 = { {11, 12, 13, 14, 15} };
		int[][] arr23Transposed = transpose(arr23);
		if (arr23Transposed != null) {
			int[][] arr23TransposedExpected = {{11}, {12}, {13}, {14}, {15}};
			System.out.println("arr23:");
			print2D(arr23);
			System.out.println("Expected result for arr23Transposed:");
			print2D(arr23TransposedExpected);
			System.out.println("Your result for arr23Transposed:");
			print2D(arr23Transposed);
			System.out.println();
			if (Arrays.deepEquals(arr23Transposed, arr23TransposedExpected))
				{System.out.println("8-B arr23: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-B arr23: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-B: transpose NOT YET IMPLEMENTED"); failures++;
		}


		int[][] arr24 = { {11}, {21}, {31}, {41}, {51} };
		int[][] arr24Transposed = transpose(arr24);
		if (arr24Transposed != null) {
			int[][] arr24TransposedExpected = {{11, 21, 31, 41, 51}};
			System.out.println("arr24:");
			print2D(arr24);
			System.out.println("Expected result for arr24Transposed:");
			print2D(arr24TransposedExpected);
			System.out.println("Your result for arr24Transposed:");
			print2D(arr24Transposed);
			System.out.println();
			if (Arrays.deepEquals(arr24Transposed, arr24TransposedExpected))
				{System.out.println("8-B arr24: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-B arr24: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-B: transpose NOT YET IMPLEMENTED"); failures++;
		}

		
		System.out.println("=======================================");
		System.out.println("  Testing EXERCISE 8-C: dotProduct");
		System.out.println("=======================================");

	
		int[][] arr310 = { {11, 12, 13}, {21, 22, 23} };
		int[][] arr311 = { {11, 12, 13, 14, 15}, {21, 22, 23, 24, 25}, {31, 32, 33, 34, 35} };
		System.out.println("arr310:");
		print2D(arr310);
		System.out.println("arr311:");
		print2D(arr311);
		int[][] dotProduct31 =dotProduct(arr310, arr311);
		if (dotProduct31 != null) {
			int[][] dotProduct31Expected = {{776, 812, 848, 884, 920}, {1406, 1472, 1538, 1604, 1670}};
			System.out.println("Expected result for dotProduct31:");
			print2D(dotProduct31Expected);
			System.out.println("Your result for dotProduct31:");
			print2D(dotProduct31);
			System.out.println();
			if (Arrays.deepEquals(dotProduct31, dotProduct31Expected))
				{System.out.println("8-C dotProduct31: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-C dotProduct31: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();

		}
		else {
			System.out.println("8-C: dotProduct NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();

		int[][] arr320 = { {5, 19, 13, 8}, {12, 18, 4, 10} };
		int[][] arr321 = { {31, 22, 14}, {15, 33, 9}, {11, 31, 25}, {0, 2, 7} };
		System.out.println("arr320:");
		print2D(arr320);
		System.out.println("arr321:");
		print2D(arr321);
		int[][] dotProduct32 =dotProduct(arr320, arr321);
		if (dotProduct32 != null) {
			int[][] dotProduct32Expected = {{583, 1156, 622}, {686, 1002, 500}};
			System.out.println("Expected result for dotProduct32:");
			print2D(dotProduct32Expected);
			System.out.println("Your result for dotProduct32:");
			print2D(dotProduct32);
			System.out.println();
			if (Arrays.deepEquals(dotProduct32, dotProduct32Expected))
				{System.out.println("8-C dotProduct32: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-C dotProduct32: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-C: dotProduct NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();

		int[][] arr330 = { {3, 5, 6} };
		int[][] arr331 = { {7}, {8}, {9} };
		System.out.println("arr330:");
		print2D(arr330);
		System.out.println("arr331:");
		print2D(arr331);
		int[][] dotProduct33 =dotProduct(arr330, arr331);
		if (dotProduct33 != null) {
			int[][] dotProduct33Expected = {{115}};
			System.out.println("Expected result for dotProduct33:");
			print2D(dotProduct33Expected);
			System.out.println("Your result for dotProduct33:");
			print2D(dotProduct33);
			System.out.println();
			if (Arrays.deepEquals(dotProduct33, dotProduct33Expected))
				{System.out.println("8-C dotProduct33: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-C dotProduct33: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-C: dotProduct NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();

		int[][] arr340 = { {1}, {2}, {3} };
		int[][] arr341 = { {4, 5, 6} };
		System.out.println("arr340:");
		print2D(arr340);
		System.out.println("arr341:");
		print2D(arr341);
		int[][] dotProduct34 =dotProduct(arr340, arr341);
		if (dotProduct34 != null) {
			int[][] dotProduct34Expected = {{4, 5, 6}, {8, 10, 12}, {12, 15, 18}};
			System.out.println("Expected result for dotProduct34:");
			print2D(dotProduct34Expected);
			System.out.println("Your result for dotProduct34:");
			print2D(dotProduct34);
			System.out.println();
			if (Arrays.deepEquals(dotProduct34, dotProduct34Expected))
				{System.out.println("8-C dotProduct34: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-C dotProduct34: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-C: dotProduct NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();


		int[][] arr350 = { {3} };
		int[][] arr351 = { {7} };
		System.out.println("arr350:");
		print2D(arr350);
		System.out.println("arr351:");
		print2D(arr351);
		int[][] dotProduct35 =dotProduct(arr350, arr351);
		if (dotProduct35 != null) {
			int[][] dotProduct35Expected = {{21}};
			System.out.println("Expected result for dotProduct35:");
			print2D(dotProduct35Expected);
			System.out.println("Your result for dotProduct35:");
			print2D(dotProduct35);
			System.out.println("");
			System.out.println();
			if (Arrays.deepEquals(dotProduct35, dotProduct35Expected))
				{System.out.println("8-C dotProduct35: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-C dotProduct35: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-C: dotProduct NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();

		System.out.println("=======================================");
		System.out.println("  Testing EXERCISE 8-D: rowSums");
		System.out.println("=======================================");


		
		int[][] arr41 = {{6, 10, 13, 3}, {11, 4, 7, 8}, {10, 14, 5, 9} };
		System.out.println("arr41:");
		print2D(arr41);
		int[] rowSums41 = rowSums(arr41);
		if (rowSums41 != null) {
			int[] rowSums41Expected = {32, 30, 38};
			System.out.println("Expected result for rowSums41:");
			System.out.println(Arrays.toString(rowSums41Expected));
			System.out.println("Your result for rowSums41:");
			System.out.println(Arrays.toString(rowSums41));
			System.out.println();
			if (Arrays.equals(rowSums41, rowSums41Expected))
				{System.out.println("8-D rowSums41: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-D rowSums41: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-D: rowSums NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();
		
		int[][] arr42 = {{6}};
		System.out.println("arr42:");
		print2D(arr42);
		int[] rowSums42 = rowSums(arr42);
		if (rowSums42 != null) {
			int[] rowSums42Expected = {6};
			System.out.println("Expected result for rowSums42:");
			System.out.println(Arrays.toString(rowSums42Expected));
			System.out.println("Your result for rowSums42:");
			System.out.println(Arrays.toString(rowSums42));
			System.out.println();
			if (Arrays.equals(rowSums42, rowSums42Expected))
				{System.out.println("8-D rowSums42: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-D rowSums42: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-D: rowSums NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();


		System.out.println("=======================================");
		System.out.println("  Testing EXERCISE 8-E: colSums");
		System.out.println("=======================================");

		
		int[][] arr51 = {{6, 10, 13, 3}, {11, 4, 7, 8}, {10, 14, 5, 9} };
		System.out.println("arr51:");
		print2D(arr51);
		int[] colSums51 = colSums(arr51);
		if (colSums51 != null) {
			int[] colSums51Expected = {27, 28, 25, 20};
			System.out.println("Expected result for colSums51:");
			System.out.println(Arrays.toString(colSums51Expected));
			System.out.println("Your result for colSums51:");
			System.out.println(Arrays.toString(colSums51));
			System.out.println();
			if (Arrays.equals(colSums51, colSums51Expected))
				{System.out.println("8-E colSums51: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-E colSums51: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-E: colSums NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();
		
		int[][] arr52 = {{6}};
		System.out.println("arr52:");
		print2D(arr52);
		System.out.println("Result of calling colSums with arr52:");
		int[] colSums52 = colSums(arr52);
		if (colSums52 != null) {
			int[] colSums52Expected = {6};
			System.out.println("Expected result for colSums52:");
			System.out.println(Arrays.toString(colSums52Expected));
			System.out.println("Your result for colSums52:");
			System.out.println(Arrays.toString(colSums52));
			System.out.println();
			if (Arrays.equals(colSums52, colSums52Expected))
				{System.out.println("8-E colSums52: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
			else
				{System.out.println("8-E colSums52: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
			System.out.println();
		}
		else {
			System.out.println("8-E: colSums NOT YET IMPLEMENTED"); failures++;
		}
		System.out.println();

		System.out.println("=======================================");
		System.out.println("  Testing EXERCISE 8-F: rotateClockwise");
		System.out.println("=======================================");

		
		int[][] arr61 = {{10, 9, 8, 7}, {6, 5, 4, 3}, {2, 1, 0, -1} };
		System.out.println("arr61:");
		print2D(arr61);
		int[][] arr61Expected = {{6, 10, 9, 8}, {2, 5, 4, 7}, {1, 0, -1, 3}};
		System.out.println("Expected result for arr61 after calling rotateClockwise:");
		print2D(arr61Expected);
		rotateClockwise(arr61);
		System.out.println("Your result for arr61 after calling rotateClockwise:");
		print2D(arr61);
		System.out.println();
		if (Arrays.deepEquals(arr61, arr61Expected))
			{System.out.println("8-F arr61: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
		else
			{System.out.println("8-F arr61: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
		System.out.println();

		int[][] arr62 = {{10, 9, 8, 7}, {2, 1, 0, -1} };
		System.out.println("arr62:");
		print2D(arr62);
		int[][] arr62Expected = {{2, 10, 9, 8}, {1, 0, -1, 7}};
		System.out.println("Expected result for arr62 after calling rotateClockwise:");
		print2D(arr62Expected);
		rotateClockwise(arr62);
		System.out.println("Your result for arr62 after calling rotateClockwise:");
		print2D(arr62);
		System.out.println();
		if (Arrays.deepEquals(arr62, arr62Expected))
			{System.out.println("8-F arr62: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
		else
			{System.out.println("8-F arr62: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
		System.out.println();

		int[][] arr63 = {{10, 9}, {8, 7}};
		System.out.println("arr63:");
		print2D(arr63);
		int[][] arr63Expected = {{8, 10}, {7, 9}};
		System.out.println("Expected result for arr63 after calling rotateClockwise:");
		print2D(arr63Expected);
		rotateClockwise(arr63);
		System.out.println("Your result for arr63 after calling rotateClockwise:");
		print2D(arr63);
		System.out.println();
		if (Arrays.deepEquals(arr63, arr63Expected))
			{System.out.println("8-F arr63: PASSED!!!!!!!!!!<<<<<<<<<<"); successes++;}
		else
			{System.out.println("8-F arr63: FAILED!!!!!!!!!!<<<<<<<<<<"); failures++;}
		System.out.println();
		
		System.out.println("**************** FINAL SCORE: ****************");
		System.out.println(" Number of successes: " + successes);
		System.out.println(" Number of failures: " + failures);
		System.out.println("**********************************************");
	

	}

}
