class RowsumArray {
    public static void main(String[] args) {
		int[][] numbers ={{1,2,3,},{10,20,30},{100,200,300}};
			for (int i = 0; i < numbers.length; i++) {
			    int rowSum = 0; 
			    for (int j = 0; j < numbers[i].length; j++) {
			        rowSum += numbers[i][j];
			    }
			    System.out.println("Sum of each row elements" + (i + 1) + ": " + rowSum);
			}
	}

}
