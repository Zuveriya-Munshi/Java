import java.util.Scanner;

class student {
    String name;
    int id;
    student(){
        name = null;
        id = 0;
    }
    student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
}
class results extends student{
    int rank;
    double spi;
    results(String name, int id, int rank, double spi){
        super(name, id);
        this.rank = rank;
        this.spi = spi;
    }
    int getRank() { return rank;}
    double getSpi() { return spi;}
    public String toString(){
        return name + " "  + id + " " + rank + " " + spi;
    }
}

public class students{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        double max = 0;
        System.out.println("How many students : ");
        int n = s.nextInt();
         results[] r = new results[n];
        for(int i=0; i<n; i++){
        System.out.println( "Enter Student details");
        System.out.print("Enter Name : ");
	String name = s.next();
	System.out.print("Enter ID : ");
	int id = s.nextInt();
	System.out.print("Enter Rank : ");
	int rank = s.nextInt();
	System.out.print("Enter SPI : ");
	double spi = s.nextDouble();
    r[i] = new results(name,id,rank,spi);
        }
    for(int i=0;i<n;i++){

    if(r[i].getRank()<10){
        System.out.println("\nRank < 10 " + r[i]);

    }
   
    if(r[i].getSpi() > max){
        max = r[i].getSpi();
        System.out.println("\n\nHighest SPI " + r[i]);
    }
	//System.out.print("Enter lower limit for spi : ");
	double s1 = 7.0;
	//System.out.print("Enter upper limit for spi : ");
	double s2 =10.0;
	if(r[i].getSpi()>s1 || r[i].getSpi()<s2){
	System.out.println("\n\nSPI in range " + s1 + " to " + s2 + " : " + r[i]);
	
	}


}
}
}