import java.util.Scanner;

class AdamNumber {
    public static void main(String[] args) 
    {    Scanner s = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int num = s.nextInt();
          int square, reverse=0,temp;
          int digit;
          square = num*num;
          temp = square;
          while (temp != 0)
          {  digit = temp%10;
             reverse = reverse*10+digit;
             temp = temp/10;
          }
          int sqrtreverse = (int) Math.sqrt(reverse);
          
          if (sqrtreverse*sqrtreverse == reverse) 
          {
              System.out.println(num + " is an Adam number.");
          } 
          else 
          {
              System.out.println(num + " is not an Adam number.");
          }
  
          s.close();
      }
    
}
