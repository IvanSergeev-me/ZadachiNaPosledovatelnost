import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую число элементов, больших предыдущего (пер-
//вый элемент последовательности тоже считается таким).
public class Z7139 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		 	int a,prev,k=1;
		 	a=s.nextInt();
		 	prev=a;
		 	while (s.hasNextInt()) {
		 		a=s.nextInt();
		 		if (a>prev) {
		 			k++;
		 			prev=a;
		 			System.out.println("testK="+k);
		 			
		 		}
		 		prev=a;
		 		
		 		
		 		
		 	}
		 	System.out.println("Кол-во чисел , больших предыдущего="+k);
		 	s.close();
	 }
}
//done