//Sum of each column elements in array
class ColumnsumArray {
    public static void main(String[] args) {
		int[][] numbers ={{1,2,3,},{10,20,30},{100,200,300}};
			int numColumn = numbers[0].length;
			int[] columnSums = new int[numColumn];
			for (int[] row : numbers) {
			    for (int j = 0; j < numColumn; j++) {
			        columnSums[j] += row[j];
			    }
			}
			for (int j = 0; j < numColumn; j++) {
			    System.out.println("Sum of each column elements" + (j + 1) + ": " + columnSums[j]);
			}
	}

}
