import java.util.Scanner;

class Biggernumber {
    public static void main(String[] args) 
    {   
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number1:...");
		int Numb1 = s.nextInt();
		System.out.println("Enter the number2:....");
		int Numb2 = s.nextInt();
		if (Numb1>Numb2)
		{   
			System.out.println("Entered Numb1 is Greater....");
		}
		else if (Numb1<Numb2)
		{   
			System.out.println("Entered Numb1 is Smaller....");
		}
		else
		{   
			System.out.println("Enter valid number....");
		}
		s.close();
	}

}
