import java.util.*;
class Student{
int idno;
int rank;
Student(){
idno = 0;
rank = 0;
}
Student(int id, int r){
	idno = id;
	rank=r;
  }
int getRank(){
	return rank;
  }
int getId(){
return idno;}
}
class stud_main{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
int i;
System.out.println("How many Students : ");
int n = sc.nextInt();
Student s[] = new Student[n];
for(i=0;i<n;i++){
  	System.out.print("Enter ID : ");
	int id = sc.nextInt();
	System.out.print("Enter Rank : ");
	int rank = sc.nextInt();
	
	s[i] = new Student(id,rank);
  }
  System.out.println("Enter r1 : ");
  int r1 = sc.nextInt();
  System.out.println("Enter r2 : ");
  int r2 = sc.nextInt();
try {
		if(r1<0 || r2<0) throw new Exception();	
	for(i=0;i<n;i++){
 	if(s[i].getRank()>=r1 && s[i].getRank()<=r2){
	  System.out.println("Student Id between " + r1 + " & " + r2 + " : " + s[i].getId());
	}
	}
}
	catch(Exception e){
	System.out.println("Negative value for r1 & r2 not allowed " + e);
	} 

  
 }
}