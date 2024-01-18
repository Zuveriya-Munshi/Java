class data_structure
{
  
  int n;
  int []info = new int[n];
  int get_data(){
return info[n];}
  void put_data(){
}
}
class my_stack extends data_structure{
int top;

    my_stack()
    {
        top=-1;

    }
    my_stack(int n)
    {
       this.n = n;
	top = -1;
	info=new int[n];
        
    }
    int get_data()
    {
       if(top<0)
       {
           System.out.println("Stack is empty");
           return 0;
       }
       else {  System.out.println(info[top] + " is deleted from stack ");
		 return info[top--];}
    }
    void put_data(int data)
    {
	
      if(top==n-1)
      {
           System.out.println("Stack is full");
           return;
      }
info[++top]=data; System.out.println(data + " is inserted in stack ");
 
    }

}
class my_queue extends data_structure{
int front,rear;

my_queue(int n){
this.n = n;
	front=0;
rear = -1;
	info=new int[n];
        
}
    int get_data()
    {
         if(front<0)
       {
           System.out.println("Queue is empty");
           return 0;
       }
       else { System.out.println(info[front] + " is deleted from queue "); return info[front++];}
    }
    void put_data(int data)
    {
        if(rear>=n)
      {
           System.out.println("Queue is full");
           return;
      }
      else info[++rear]=data; System.out.println(data + " is inserted in queue");

    }
}
class ds{
public static void main(String args[]){
 my_stack s = new my_stack(10);
 my_queue q = new my_queue(10);
 s.put_data(1);
 s.put_data(3);
 s.get_data();
q.put_data(11);
 q.put_data(12);
 q.get_data();
 
}
}