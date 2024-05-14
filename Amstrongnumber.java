class Amstrongnumber {
    public static void main(String[] args) 
	{
        int a[] = {11, 2, 3, -49, 5, 153, 121, 145, 28, 6, 3, 5, 11, -32};

        for (int number : a)
		{
            if (isArmstrong(number)) 
			{
                System.out.print(number + " ");
            }
        }
    }

    
    public static boolean isArmstrong(int num) 
	{
        int temp, remainder, result = 0;
        temp = num;

        num = Math.abs(num);

        while (num != 0)
		{
            remainder = num % 10;
            result += Math.pow(remainder, 3); 
            num /= 10;
        }

        return temp >= 0 && result == temp;
    }

}
