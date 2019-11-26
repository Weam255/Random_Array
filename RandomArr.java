import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class RandomArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("running");int n= Integer.parseInt(args[0]);
//Start Timer 
Instant star=Instant.now();
//Init Array 
int [] [] a=new int [n] [n] ;
int [] [] b=new int [n] [n] ;
int [] [] c=new int [n] [n] ;

//Creat a Local Variable For Random 
Random random= new Random();
//creat a loop that full a random value in a[]
for (int i=0;i<a.length;i++) {
	
	for (int j=0;j<a[i].length;j++) {
	a[i] [j]= random.nextInt()	;
	}
}
//Creat loop that fill a random value in b[]

for (int i=0;i<b.length;i++) {
	for (int j=0;j<b[i].length;j++) {
		b[i] [j]= random.nextInt()	;
}
	}
//Creat loop that fill a random value in c[]
for (int i=0;i<c.length;i++) {
	for (int j=0;j<c[i].length;j++) {
		c[i] [j]= random.nextInt()	;
}
	}
calcAverage(a);
calcAverage(b);
calcAverage(c);
//end the timer 
Instant end=Instant.now();
//print avg of each array 
System.out.println("the avg of array a is :" + calcAverage(a));
System.out.println("the avg of array b is :" + calcAverage(b));
System.out.println("the avg of array c is :" + calcAverage(c));
//print the execution duration 
System.out.println("the execution duration :" +Duration.between(star, end).getNano());
	}
	//creat a method calculator avg of each array 
		public static int calcAverage(int[] [] array2d) {
			int sum=0;
			for(int row=0;row < array2d.length;row++) {
				for(int col=0;col < array2d.length;col++) {
					sum=sum+array2d [row] [col];
					
				}
			}
			int result=sum/array2d.length;
			return result;
			
		}
		
	private static void calcAverage1(int[][] a) {
		// TODO Auto-generated method stub
		
	}
	
	}
