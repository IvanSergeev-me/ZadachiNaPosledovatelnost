//�������� ���������, �������� ������������������
//����� �����, � ���������� ���������� ��������� � ��� ��������� 1, 2,
//3, 4, 5, 6. ��� ������ 144!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner;
public class Z7143 {
		public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);
			 	System.out.println("������� �����");
			 	int a,k=0;
			 	 while (s.hasNextInt()) {
			 		a=s.nextInt();
			 		if (a==1) {
			 			a=s.nextInt();
			 			if (a==2) {
			 				a=s.nextInt();
			 				if (a==3) {
			 					a=s.nextInt();
			 					if (a==4) {
			 						a=s.nextInt();
			 						if (a==5) {
			 							a=s.nextInt();
			 							if (a==6) k++;
			 						}
			 					}
			 				}
			 			}
			 		}
			 		System.out.println("���������� ��������� ��������� 123456=  "+k);
			 		 
			 	 }
			 	System.out.println("���������� ��������� ��������� 123456=  "+k);
			 	 s.close();
		}
}
//done