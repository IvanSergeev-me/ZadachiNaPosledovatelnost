import java.util.Scanner;

//Напишите программу, вводящую последовательность
//целых чисел, и печатающую максимальное число идущих подряд одина-
//ковых элементов.
public class Z7136 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		 	int a, prev,k=1;
		 	a=s.nextInt();
		 	prev=a;
			while (s.hasNextInt()) {
				a=s.nextInt();
				
				if (prev==a)k++;
				else {
					System.out.println("Число одинаковых элементов="+k);
					k=1;
					prev=a;
				}
			
			}
			
			s.close();
	 }

}
//done