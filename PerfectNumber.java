import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your number: ");
		int numb = s.nextInt();
		int sum=0;
		for (int i=1;i<numb;i++)
		{  
		if (numb % i == 0)
		{  
				sum= sum+i;
			System.out.print(sum+" ");
		}
		
		}
		if (sum == numb)
		{  
			System.out.println("Entered Number is Perfect number:"+numb);
		}
		else 
		{
			System.out.println("Entered Number is NotPerfect number:"+numb);
		}
		s.close();
	}

}
