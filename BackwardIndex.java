class BackwardIndex {
    public static void main(String[] args)
	{ 
		String s="Your Students are very Good and Nice Students please try to focus on work Students";
		int bindex = s.lastIndexOf("Students");
		if (bindex != -1)
		{  
			System.out.println("Data Found at Positions...."+ bindex);
		}
		else
		{
			System.out.println("Data Not Found at any Postion");
		}
	}

}
