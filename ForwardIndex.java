class ForwardIndex {
    public static void main(String[] args)
	{ 
		String s="Your Students are very Good and Nice Students please try to focus on work Students";
		int findex = s.indexOf("Students");
		if (findex != -1)
		{  
			System.out.println("Data Found at Positions...."+ findex);
		}
		else
		{
			System.out.println("Data Not Found at any Postion");
		}
	}

}
