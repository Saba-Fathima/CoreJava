import java.util.Scanner;

class Shopping {
    public static void main(String[] args) 
	
	{ //scanner object creation
		Scanner s = new Scanner(System.in);
		
		//Read the data from commond prompt
		System.out.println("Enter product name:");
		String prod = s.next();
		
		System.out.println("Enter price:");
		double price=s.nextDouble();
		
		System.out.println("Enter quantity:");
		int qty=s.nextInt();
		double total;
		total=price*qty;
			if (total>1000)
			{   
			      double discount;
				  double netamt;
				  discount=(total*20)/100;
				  netamt=total-discount;
				  System.out.println("Product name is...."+prod);
				  System.out.println("Product price is...."+price);
				  System.out.println("Product quantity is..."+qty);
				  System.out.println("Total price is..."+total);
				  System.out.println("Discount price is"+discount);
				  System.out.println("Net amount to pay"+netamt);
			}
			else 
		       {  
				double discount;
				double netamt;
				discount=(total*10)/100;
				netamt=total-discount;
				  System.out.println("Product name is...."+prod);
				  System.out.println("Product price is...."+price);
				  System.out.println("Product quantity is..."+qty);
				  System.out.println("Total price is..."+total);
				  System.out.println("Discount price is"+discount);
				  System.out.println("Net amount to pay"+netamt);
			   }
			   //close the scanner object
			   s.close();
     }
}
