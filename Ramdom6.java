import java.util.Random;

class Ramdom6 
{
	public static void main(String[] args) 
	{

		Random  ran = new Random();
       int  code= (100000 + ran.nextInt(999999));
		System.out.println(code % 55);
	}
}
