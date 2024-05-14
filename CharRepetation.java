class CharRepetation {
    public static void main(String[] args)
	{
        String s = "java by ratan";
        String[] words = s.split(" ");

        for (String word : words) 
		{
            StringBuilder GivenWord = new StringBuilder();

            for (char c : word.toCharArray()) 
		    {
                if (GivenWord.indexOf(String.valueOf(c)) == -1) 
				{
                    GivenWord.append(c);
                }
            }

            System.out.print(GivenWord.toString() + " ");
        }
    }

}
