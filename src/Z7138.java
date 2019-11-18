import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую номер первого элемента, равного нулю, и
//нуль при отсутствии такого элемента в последовательности.
public class Z7138 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		 	int a,num=0;
		 	boolean proverochkaNaNolik=false;
		 	while (s.hasNextInt()) {
		 		a=s.nextInt();
		 		num++;
		 		if (a==0) {
		 			System.out.println("Первому нулевому элементу соответствует номер "+num);
		 			proverochkaNaNolik=true;
		 		}
		 		
		 	}
		 	if(proverochkaNaNolik==false) System.out.println("0");
		 	s.close();
	 }
}
//done