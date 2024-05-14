class SumArray {
    public static void main(String[] args) {
		int[][] numbers ={{1,2,3,},{10,20,30},{100,200,300}};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
		    for (int j = 0; j < numbers[i].length; j++) {
		        sum += numbers[i][j];
		    }
		}
		System.out.println("The sum of all numbers in the array is: " + sum);
	}

}
