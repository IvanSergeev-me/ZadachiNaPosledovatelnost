import java.util.Scanner;
//Напишите программу, вводящую последовательность
//из нулей и единиц, печатающую число групп из единиц, разделенных ну-
//лями. ЭТО ЗАДАЧА 143!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Z7144 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("Вводите числа");
		 	int a,k=0;
		 	a=s.nextInt();
		 	 while (s.hasNextInt()) {
		 		 a=s.nextInt();
		 		 if ((a!=0)&&(a!=1))break;
		 		 if (a == 0 ) {
		 			 k++; 
		 			
		 		 }
		 	
		 	
		 	 }
		 	
		 	System.out.println("Число групп из 1, разделенных нулем= "+k);
		 	
		 s.close();	
	 }
}
//не решено