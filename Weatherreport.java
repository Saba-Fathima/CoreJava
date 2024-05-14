import java.util.Scanner;

class Weatherreport {
    public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
	    System.out.println("Is It Raining??:(True/False)");
	    boolean Rainy= s.nextBoolean();
	    System.out.println("Is It Windy??:(True/False)");
	    boolean Windy= s.nextBoolean();
	    if (Rainy&&Windy)
	  {  
		System.out.println("There is Cyclone Don't go out.........");
	  }
	    else if (Rainy || Windy)
	 {   
		System.out.println("Climate is not good Don't go out.......");
	 } 
	   else
	 {   
		System.out.println("It's Your Choice to go out....");
	 }
	 s.close();
  }

}
