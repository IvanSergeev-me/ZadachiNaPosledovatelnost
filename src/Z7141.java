import java.util.Scanner;
//Напишите программу, вводящую последовательность
//целых чисел, и печатающую три ее таких (не обязательно различных)
//элемента x, y и z, что xy = z, или No, если таких элементов нет.
public class Z7141 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		 	  int n=0, count = 0, a, z =0, x = 0, y = 0;
		        while (s.hasNextInt()) {
		            a = s.nextInt();
		            count++;
		            if (count % 3 == 0) {
		                z = a;
		                n = n + 3;
		            }
		            if (count - n == 1) x = a;
		            if (count - n == 2) y = a;
		            if (x * y == z) System.out.println("x="+x + " " + "y="  + y + " " + "z=" + z);
		           else  if (x * z == y) System.out.println("x="+x + " " + "y="  + z + " " + "z=" + y);
		           else  if (y * z == x) System.out.println("x="+y + " " + "y="  + z + " " + "z=" + x);
		        }
		        System.out.println("x = "+x + "y = " + y + "z = " + z);
		        s.close();
		 		 }
}
//решено
