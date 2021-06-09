package matrices;

/*Q) From this Matrix:
    10   4     5
    0    0    35
    0    25    9
    0    10   25

1) Find Minimum number from the above matrix
2) Find Maximum number from the above matrix
*/

public class MinMax {

	public static void main(String[] args) {
		int matrix[][]= {{10,4,5},{0,0,35},{0,25,9},{0,10,25}};
		int min=matrix[0][0];
		int max=matrix[0][0];
		System.out.println("Given Matrix");
		/*for (int row=0; row<4; row++)
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
		}*/
		for (int col=0; col<3; col++)
		{
			for (int row=0; row<4; row++)
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
		
	}

}
