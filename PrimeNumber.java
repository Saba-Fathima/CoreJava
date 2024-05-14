import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args)
	{ 
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your Number: ");
		int numb = s.nextInt();
		int fact = 0;

		for (int i= numb/2;i<numb;i++)
		{  
			if (numb % i == 0)
			{  
				fact++;
			break;
			}
		}
		if (fact == 0)
		{  
			System.out.println("Entered number is Prime number.."+numb);
		}
		else 
		{  
			System.out.println("Entered number is not Prime number..."+numb);
		}
		s.close();
	}

}
