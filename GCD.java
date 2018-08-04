import java.util.Scanner;

class GCD
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a  :");
		int a = sc.nextInt();
		System.out.print("enter b :");
		int b = sc.nextInt();
      
	    while (a != b)
	    {
			if(a > b)
			{ 
			  a = a-b;
			}
	    }
		System.out.println("GCD : " + a);
	}
}

OUTPUT:
-------
enter a  :20
enter b :4
GCD : 4

