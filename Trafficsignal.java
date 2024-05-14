import java.util.Scanner;

class Trafficsignal {
    void redInfo()
	{
		System.out.println("It is red light");
		System.out.println("Do not go.It is danger");
		System.out.println("wait for green signal");
		
	}
	void yellowInfo()
	{
		System.out.println("It is yellow light");
		System.out.println("Green light is about to come");
		System.out.println("Start your engines");
		
	}
	void greenInfo()
	{
		System.out.println("It is green light");
		System.out.println("It is safe to go");
		System.out.println("Cross the road before red light");
		
	}
	public static void main(String[] args)
	{
		Trafficsignal traffic = new Trafficsignal();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the option...");
		String option = s.next();

		

		switch(option)
		{
			case "red" :  traffic.redInfo();
			             break;
			case "yellow" :  traffic.yellowInfo();
			                break;
			case "green" :  traffic.greenInfo();
			               break;
			default : System.out.println("Enter valid input");
			          break;
		}
		s.close();
	}

}
