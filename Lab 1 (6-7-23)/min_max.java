//Date : 06/07/2023
import java.util.*;
class min_max
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter value of a : " );
		int a=s.nextInt();
		System.out.print("Enter value of b : " );
		int b=s.nextInt();
		System.out.print("Enter value of c : " );
		int c=s.nextInt();
		if(a>b && a>c)
			System.out.println(a + " is Maximum");

		else if (b>a && b>c)
			System.out.println(b + " is Maximum");

		else
			System.out.println(c + " is Maximum");

		if(a<b && a<c)
			System.out.println(a + " is Minimum");

		else if (b<a && b<c)
			System.out.println(b + " is Minimum");
		
		else
			System.out.println(c + " is Minimum");
		
	}
}	
		