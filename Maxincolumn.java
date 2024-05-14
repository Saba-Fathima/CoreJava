//Maximun element in each Column in array 
 class Maxincolumn {
    public static void main(String[] args) {
		int[][] number ={{1,2,3,},{10,20,30},{100,200,300}};
		int numrows = number.length;
		int numcols = number[0].length;
		for (int j = 0; j < numcols; j++) {
		    int maxcol = number[0][j];
		    for (int i = 1; i < numrows; i++) {
		        if (number[i][j] > maxcol) {
		            maxcol = number[i][j];
		        }
		    }
		    System.out.println("Maximum element in each column " + (j + 1) + ": " + maxcol);
		}
	}

}
