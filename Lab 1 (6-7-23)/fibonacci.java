//Date : 06/07/2023
import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=s.nextInt();
		int f0=0, f1=1, f2=0;
		System.out.print(f0 + ", " + f1);
		for(int i=0;i<num;i++)
		{
			f2 = f0+f1;
			System.out.print(", " + f2);
			f0=f1;
			f1=f2;
			
		}
	}
}
	