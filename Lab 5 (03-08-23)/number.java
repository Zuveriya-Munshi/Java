import java.util.*;
class number
{
 public static void main(String args[])
 {
	Scanner s = new Scanner(System.in);
	System.out.println("How many numbers you want to add : ");
	int n = s.nextInt();
	int sum=0;
	System.out.println("Enter "+n+" numbers : ");
	for(int i=0;i<n;i++){
	  
	  int no = s.nextInt();
	try{
		if(no<0) throw new Exception();
		sum+=no;
	}
	catch(Exception e){
		System.out.println("Negative number not allowed :" + e);
	  }
	}
	System.out.println("Sum of positive numbers : " + sum);
 }
}