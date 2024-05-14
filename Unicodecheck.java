import java.util.Scanner;

class Unicodecheck {
    public static void main (String[] args)
	{   
		Scanner s = new Scanner (System.in);

		System.out.println("Enter unicode number....");
		int numb = s.nextInt();

		switch(numb)
	    {  case 'A' : System.out.println("The corresponding char is A");
		              break;
	      case 'B' : System.out.println("The corresponding char is B");
		             break;
	      case 'C' : System.out.println("The corresponding char is C");
		             break;
	     default : System.out.println("Invalid Data.....");
	                break;
	   }
	s.close();
	}

}
