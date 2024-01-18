import java.util.*;
import java.lang.Math;
class student{
	String name;
	int id;
	student(){
	name= null;
	id=0;
	}
	student(String name,int id){
	this.name = name;
	this.id=id;
	}
	/*int getId(){
		return id;
	}
	String getName(){
		return name;
	}*/

}
class result extends student{
	int rank;
 	float spi;
	result(){ 
	super();
	rank=0;
	spi=0;
	}
	result(String name,int id,int rank,float spi){
		this.name = name;
		this.id=id;
		this.rank=rank;
		this.spi=spi;
	}
	public int getRank(){
		return rank;
	}
	public float getSpi(){
		return spi;
	}
	
	public void display(){
		System.out.println("Name : " +name+ " Id : "+id+ " Rank : "+rank+ " SPI : "+spi);
	}
}
class student_res{
public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	
	float max= 0;
	 
	System.out.println("How many Students : ");
	int n = s.nextInt();
	result[] res = new result[n];
	for(int i=0;i<n;i++){
	System.out.println("Enter Details of Student "+(i+1));
	System.out.print("Enter Name : ");
	String name = s.next();
	System.out.print("Enter ID : ");
	int id = s.nextInt();
	System.out.print("Enter Rank : ");
	int rank = s.nextInt();
	System.out.print("Enter SPI : ");
	float spi = s.nextFloat();
	res[i] = new result(name,id,rank,spi);
	
	
	res[i].display();
     }
	for(int i=0;i<n;i++){
	if( res[i].getSpi()>max)
	  {
		max = res[i].getSpi();
		System.out.println("Student with Highest SPI : ");
		System.out.println(res[i].display);
	  }
	  if(res[i].getRank()<10)
	  {
		System.out.println("Student with Rank<10 : ");
		System.out.println(res[i].display);
	  }
	}
  }
}