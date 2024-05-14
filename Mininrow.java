//Maximun element in each row in array
class Mininrow {
    public static void main(String[] args) {
		int[][] number ={{1,2,3,},{10,20,30},{100,200,300}};
		int numrows = number.length;
		int numcols = number[0].length;
		for (int i = 0; i < numrows; i++) {
		    int maxrow = number[i][0];
		    for (int j = 1; j < numcols; j++) {
		        if (number[i][j] > maxrow) {
		            maxrow = number[i][j];
		        }
		    }
		    System.out.println("Maximum element in each row " + (i + 1) + ": " + maxrow);
		}
	}

}
