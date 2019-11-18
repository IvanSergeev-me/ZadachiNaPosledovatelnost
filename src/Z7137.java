import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую номера первого и последнего ее максималь-
//ных элементов.
public class Z7137 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		    int max =-2147483648, a, count = 0, perv=0, lastMax=0;
		    while (s.hasNextInt()) {
		         a = s.nextInt();
		         count++;
		         if (a>max) {
		             max = a;
		             perv = count;
		         }
		         if (a==max) lastMax = count;
		        

		         System.out.println("Первое максимальное число = " + perv);
		         System.out.println("Последнее максимальное число = " + lastMax );

		     }
		     System.out.println("Первое максимальное число = " + perv);
		     System.out.println("Последнее максимальное число = " + lastMax);
		     s.close();
	 }
	 
}

//(He) решено