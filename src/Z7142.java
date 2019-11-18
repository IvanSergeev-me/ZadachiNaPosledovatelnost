import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую максимальную длину монотонного участка
//ее элементов.
public class Z7142 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		 	int maxLength=0, schmin=0, schmax=0,  a = 0, b = 0;
	        while (s.hasNextInt()){
	            a = s.nextInt();
	            if (b==a) {
	                schmin = 1;
	                schmax ++;
	              
	            }
	            if (a>b) {
	                schmax++;
	                schmin = 0;
	            }
	            if (a<b){
	                schmin++;
	                schmax =0;
	            }
	            if (schmax>maxLength) {
	                maxLength = schmax;

	            }
	            if (schmin>maxLength) {
	                maxLength = schmin;

	            }
	            b=a;
	            
	            System.out.println("Максимальная длина монотонного участка = " + maxLength);
	            
	        }
	        System.out.println("Максимальная длина монотонного участка = " + maxLength);
		 		 s.close();
		 		 
		 		 
		 	 }
}
	//решено 	
		 	
		 	
	 
