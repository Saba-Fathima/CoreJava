//Minimun element in array
class Minimumelements {
    public static void main(String[] args) {
		int[][] number ={{1,2,3,},{10,20,30},{100,200,300}};
		int min = number[0][0]; 
		  for(int i=0;i<number.length;i++)
		  {  for(int j=0;j<number[i].length;j++)
		    {
			  if (number[i][j] < min)
			    {
		            min = number[i][j];
		        }
		    }
		  }
		  System.out.println("The minimum element in the array: "+min);
	}

}
