import java.util.Scanner;

class Swapping {
    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
			int[] num = {10,20,25,30,35,40,50};
		System.out.println("Enter Your search element:");
		int element = s.nextInt();
		boolean Search = false;
		for(int numb : num)
		{ 
			if (numb == element)
			{ 
				Search = true;
				break;
			}
		}
		if (Search)
		{ 
			System.out.println("Element entered is present in Array:"+element);
		}
		else
		{
			System.out.println("Element entered is not present in Array:"+element);
		}
	s.close();	
	}

}
