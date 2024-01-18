class stackCmd
{
  int top;
  int arr[];
  int cap;
  stackCmd(int cap)
  {
	this.cap = cap;
	top=-1;
	arr = new int[cap];
  }
  public void push(int data)
  {
	if(isFull())
	{
	  System.out.println("Stack Overflow");	
	  System.exit(0);
	}
        arr[++top] = data;
	System.out.println(data + " is pushed ");
  }
  public int pop()
  {
	if(isEmpty())
	{
	  System.out.println("Stack Underflow");	
	  return -1;
	}
	return arr[top--];
  }
  public Boolean isFull()
  {
	return top == cap-1;
  }
  public Boolean isEmpty()
  {
	return top == -1;
  }
  public void print()
  {
	System.out.print("Stack : ");
	for(int i=0;i<=top;i++)
	{
		System.out.print(arr[i] + " ");
		
	}System.out.println();
  }
}
class stack
{
  public static void main(String args[])
  {
	int cap = 10;
	stackCmd s = new stackCmd(cap);
	try{ 
		for(int i=0;i<args.length;i++)
		{ 
		  String op = args[i];
		  if(op.equals("push"))
		  { 
			i++;
			int val = Integer.parseInt(args[i]);
			s.push(val);
		  }
		  else if(op.equals("pop"))
		  {
 			int poppedVal = s.pop();
			if(poppedVal != -1)
			System.out.println(poppedVal + " is Popped");
		  }
		  if(op.equals("print"))
		  {
                    s.print();
		  }
		}
	}
	catch(NumberFormatException e)
	{
		System.out.println("Invalid Number format ");
	}
  }
}
