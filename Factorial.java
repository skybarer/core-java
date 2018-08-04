import java.util.Scanner;

class  Factorial
{
 static int fact = 1;

  public static void main(String[] args) 
 {
  Scanner sc = new Scanner( System.in);

   System.out.print("\nenter the number to find factorial: ");

   int num = sc.nextInt();

   for (int i= num ; num > 0 ; num-- )
  {
    fact = fact *num;
  }

   System.out.println( fact);

  }
}