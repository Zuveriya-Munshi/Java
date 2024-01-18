import java.util.*;
public class stackClass
{
		int top,capacity;
		int arr[];
		stackClass(int size)
		{	
			arr = new int[size];
			capacity = size; 
			top=-1;
		}
	
		public void push(int data)
		{
			if(isFull())
			{
				System.out.println("Stack Overflow"); 
				System.exit(1);
			}
			System.out.println(data + " is Pushed ");
			arr[++top]=data;
		}
		public int pop()
		{
			if(isEmpty())
			{
				System.out.println("Stack Underflow"); 
				System.exit(1);
			}
		
			return arr[top--];
		}
		public Boolean isFull()
 		{
			return top == capacity-1;
		}
		public Boolean isEmpty()
 		{
			return top == -1;
		}
		
 		public void print()
		{
			for(int i=0;i<=top;i++)
			  {
				System.out.print(arr[i] + " ");
	 		  }System.out.println();
		}
		
	
	public static void main(String args[])
	{
	  stackClass s = new stackClass(10);
	  s.push(5);
	  s.push(3);
	  s.push(13);
          System.out.print("Stack : ");
          s.print();
          s.pop();
System.out.print("Stack After Popping out : ");
	    s.print();
			
	}
	
}