import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую второй по величине ее элемент и No, если
//такого элемента нет.
public class Z7140 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		 	int a,firstMax,secondMax;
		 	a=s.nextInt();
		 	firstMax=a;
		 	secondMax=-2147483648;
		 	while (s.hasNextInt()) {
		 		a = s.nextInt();
	            if (a > firstMax) {
	            	secondMax=firstMax;
	                firstMax = a;
	                
	            }
	            if (a>secondMax&&a<firstMax) secondMax=a;
	        
		 		
		 	}
		 	if (secondMax!=-2147483648) {
		 		 System.out.println("Второй максимум="+secondMax);
		 	}
		 	else System.out.println("0");
		 	
		 	s.close();

	 }
		 
}
//done