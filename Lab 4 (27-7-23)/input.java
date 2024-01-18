import java.util.*;
class input{
public static void main(String []args){
	Scanner r = new Scanner(System.in);
	System.out.print("Enter statement : ");
	String str = r.nextLine();
	System.out.print("Enter word : ");
	String ch = r.next();
	System.out.print("Boolean : ");
	boolean bool = r.nextBoolean();	
	
	System.out.print("Enter integer number : ");
	int num = r.nextInt();
	System.out.print("Enter float number : ");
	float num1 = r.nextFloat();
	System.out.print("Enter double number : ");
	double num2 = r.nextDouble();
	System.out.print("Enter long number : ");
	long num3 = r.nextLong();
	System.out.print("Enter text : ");
	System.out.println(r.hasNext("bvm"));
	
	
	System.out.println("String : " + str);
	System.out.println("Word : "  + ch);
	System.out.println("Boolean : " + bool);
	System.out.println("Integer : " + num);
	System.out.println("Float : " +num1);
	System.out.println("Double : " +num2);
	System.out.println("Long : " +num3);
	
	
 }
}