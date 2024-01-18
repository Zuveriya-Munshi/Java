class Node
{
  Node next;
  int data;
  Node()
  {
	next=null;
	data=0;
  }
  Node(int data)
  {	
	this.data = data;
	next = null;
  }
  void append(Node newNode)
  {
	Node t_ref = this;
	while(t_ref.next != null)
	{
		t_ref = t_ref.next;
	}
	System.out.print(newNode.data + " is Appended ");
	t_ref.next = newNode;
	System.out.println();
  }
  void delete()
  {
	Node t_ref = this;
	while(t_ref.next.next != null)
	{
		t_ref = t_ref.next;
	}
 
System.out.println();
	System.out.println(t_ref.next.data + " is Deleted ");
	t_ref.next=null;
  }
  void traverse()
  {
	Node t_ref = this;
	System.out.print("Linked List : " );
	while(t_ref != null)
	{
		System.out.print(t_ref.data + " ");
		t_ref = t_ref.next;
		
	}

  }
void search(int key)
{
Node t_ref = this;
  
	while(t_ref != null)
	{
		if(t_ref.data == key)
		System.out.print("\n" + t_ref.data + " found  ");
		
	t_ref = t_ref.next;	
	}
}

}
class linkedList
{
	public static void main(String args[])
	{
		Node first = new Node(5);
		Node ref1 = new Node(15);
		Node ref2 = new Node(25);
		first.append(ref1);
		first.append(ref2);
		first.traverse();
		
		first.delete();
		first.traverse();
		first.search(15);
	}
}
