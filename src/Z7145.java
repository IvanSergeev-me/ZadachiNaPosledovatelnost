//�������� ���������, �������� ������������������
//����� �����, � ���������� ���������� ��������� � ��� ��������� 1, 2,
//1, 2, 1, 2.
import java.util.Scanner;
public class Z7145 {
		public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);
			 	System.out.println("������� �����");
			 	int a,k=0,b;
			 	 while (s.hasNextInt()) {
			 		a=s.nextInt();
			 		b=a;
			 		
			 		if (b!=1 && b!=2)k=0;
			 		if (k>=1 && a==1) {
			 			a=s.nextInt();
			 			if (a==2) k++;
			 		}
			 		if(k>=1) {
			 			
			 		}
			 		else {
			 		if (a==1) {
			 			a=s.nextInt();
			 			if (a==2) {
			 				a=s.nextInt();
			 				if (a==1) {
			 					a=s.nextInt();
			 					if (a==2) {
			 						a=s.nextInt();
			 						if (a==1) {
			 							a=s.nextInt();
			 							System.out.println("� ����������, � �� ������");
			 							if (a==2) k++;
			 						}
			 					}
			 				}
			 			}
			 		}
			 		}
			 		
			 		System.out.println("���������� ��������� ��������� 121212=  "+k);
			 		 
			 	 }
			 	System.out.println("���������� ��������� ��������� 121212=  "+k);
			 	 s.close();
		}
}
//������