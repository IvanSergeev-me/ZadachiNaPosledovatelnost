import java.util.Scanner;

//�������� ���������, �������� ������������������
//����� �����, � ���������� ������������ ����� ������ ������ �����-
//����� ���������.
public class Z7136 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("������� �����");
		 	int a, prev,k=1;
		 	a=s.nextInt();
		 	prev=a;
			while (s.hasNextInt()) {
				a=s.nextInt();
				
				if (prev==a)k++;
				else {
					System.out.println("����� ���������� ���������="+k);
					k=1;
					prev=a;
				}
			
			}
			
			s.close();
	 }

}
//done