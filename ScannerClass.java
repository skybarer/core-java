import java.util.Scanner;

class ScannerClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a integer :");
		int a = sc.nextInt();
		System.out.print("enter a integer :");
		int b = sc.nextInt();
        System.out.println("sum :"+ (a+b));
	}
}

OUTPUT:
-----------
enter a integer :10
enter a integer :20
sum :30
