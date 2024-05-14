class StringPalindrome {
    public static void main(String[] args) {
		String str = "The madam will refer and level us";
		String[] words = str.split(" ");
		
		for(String word : words)
		{
			boolean isPalindrome = true;
			int left = 0, right = word.length() -1;
			char[] chars = word.toCharArray();
			
			while(left < right)
			{
				if(chars[left] != chars[right])
				{
					isPalindrome = false;
					break;
				}
				left++;
				right--;
			}
			if(isPalindrome)
			{
				System.out.print(word + " ");
			}
		}
	}
}
