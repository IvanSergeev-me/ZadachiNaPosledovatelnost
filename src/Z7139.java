import java.util.Scanner;
//�������� ���������, �������� ������������������
//����� �����, � ���������� ����� ���������, ������� ����������� (���-
//��� ������� ������������������ ���� ��������� �����).
public class Z7139 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("������� �����");
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
		 	System.out.println("���-�� ����� , ������� �����������="+k);
		 	s.close();
	 }
}
//done