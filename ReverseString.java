class ReverseString {
    public static void main(String[] args)
 {
	String s = "java by ratan";
	String[] words = s.split(" ");
	for (String word:words)
	{  
		char[] chars = word.toCharArray();
		int left = 0;
		int right = chars.length - 1;
		char temp;
		for (int i = 0;i<chars.length;i++)
		{  
			while (left < right)
			{ 
				temp=chars[left];
				chars[left]=chars[right];
				chars [right] = temp;
				left++;
				right--;
			}
		}
		System.out.print(chars);
		System.out.print(" ");
	}
  }

}
