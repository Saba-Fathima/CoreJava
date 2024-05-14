import java.util.Scanner;

class Employee {
    public static void main(String[] args) 
	{ //scanner object creation
		Scanner s=new Scanner (System.in);
		//Read the data from commond prompt
		System.out.println("Enter empid..."); //123
		int empId = s.nextInt();
		
		System.out.println("Enter empname..."); //saba
		String empName = s.next();
		
		System.out.println("Enter empsalary..."); //1000.76
		double empSalary = s.nextDouble();

		if (empSalary<5000)
		{  
			System.out.println("He is poor employee");
			System.out.println("empid"+empId);
			System.out.println("empname"+empName);
			System.out.println("empsalary"+empSalary);

		}
         //close the scanner object
		 s.close();
	}

}
