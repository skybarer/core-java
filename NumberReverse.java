class NumberReverse 
{
	public static void main(String[] args) 
	{
		int num =12345;
		int reverse=0;

		while(num !=0){
		  reverse *=10;
		  reverse+=num%10;
		  num = num/10;
			System.out.println("reverse "+reverse);
		}

		System.out.println("Reverese of a number "+reverse);
	}
}
