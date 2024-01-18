import java.util.*;
class rangeExp
{
 public static void main(String args[])
 {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number : ");
	int n = s.nextInt();
	int sum=0;

	while(n!=0){
 
	try{
		if(n<-1000 || n>1000) throw new Exception();
		sum+=n;
		//if(no==0) break;
	}
	catch(Exception e){
		System.out.println("Out of range(-1000 to 1000) :" + e);
	  }
	System.out.println("Enter next number (Press 0 to Exit) : ");
	n = s.nextInt();
	}
	System.out.println("Sum of positive numbers : " + sum);
 }
}