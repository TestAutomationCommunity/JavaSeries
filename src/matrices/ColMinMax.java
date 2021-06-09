package matrices;

import java.util.LinkedHashMap;

/*Q) From this Matrix:
    10   4     5
    0    0    35
    0    25    9
    0    10   25

1) Find Minimum number from the above matrix
2) Find Maximum number from the above matrix
3) Find Maximum number in the column having minimum number. 
4) If there are two or more columns with same minimum number then find the maximum number which is maximum of all the columns. So in this case answer should be 25

Variations of Test Data
    10   4     5
    0    0    35
    0    25    0
    0    10   25
    
    10   4     5
    0    10    35
    0    25    9
    0    10   25
*/

public class ColMinMax {

	public static void main(String[] args) {
		int matrix[][]= {{10,4,5},{0,0,35},{0,25,9},{0,10,25}};
//		int matrix[][]= {{10,4,5},{0,0,35},{0,25,0},{0,10,25}};
//		int matrix[][]= {{10,4,5},{0,10,35},{0,25,9},{0,10,25}};
		int min=matrix[0][0];
		int max=matrix[0][0];
		int col_min[] = matrix[0].clone();
		int col_max[] = matrix[0].clone();
		int colCount = 0;
		int maxCol;
		
		System.out.println("Given Matrix");
		for (int row=0; row<4; row++)
		{
			for (int col=0; col<3; col++)
			{
				System.out.print(matrix[row][col] + "\t");
				if(matrix[row][col]<min)
					min=matrix[row][col];
				if(matrix[row][col]>max)
					max=matrix[row][col];
			}
			System.out.println();
		}
		System.out.println("Minimum number from matrix is: " + min);
		System.out.println("Maximum number from matrix is: " + max);
		
		for (int col=0; col<3; col++)
		{
			for (int row=0; row<4; row++)
			{
				int value=matrix[row][col];
//				System.out.print(matrix[row][col] + "\t");
//				if(value<min)
//					min=value;
//				if(value>max)
//					max=value;
				if(value<col_min[col])
					col_min[col]  = value;
				if(value>col_max[col])
					col_max[col]  = value;
			}
//			System.out.println();
		}

		System.out.println("Min of each col: " + col_min[0] + "\t" + col_min[1] + "\t" + col_min[2]);
		System.out.println("Max of each col: " + col_max[0] + "\t" + col_max[1] + "\t" + col_max[2]);
		
		maxCol = col_max[0];
		for(int col=0; col<3; col++)
		{
			if(col_min[col]==min)
			{
				colCount++;
				System.out.println("Max of column " + (col+1) + "(containing min value): " + col_max[col]);
				if(maxCol < col_max[col])
					maxCol = col_max[col];
			}
				
		}
		
		if(colCount > 1)
			System.out.println("Max value from qualified columns: " + maxCol);
		else
			System.out.println("Note: only single column contains minimum value");
	}

}
