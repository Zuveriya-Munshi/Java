//Date : 06/07/2023
class cmd_line
{
	public static void main(String args[])
	{
		System.out.println("Number of Arguments : " + args.length);
		for(int i=0;i<args.length;i++)
		{
			System.out.print(args[i] + " ");
		}
	}
}