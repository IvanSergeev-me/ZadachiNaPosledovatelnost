import java.util.Scanner;
//�������� ���������, �������� ������������������
//����� �����, � ���������� ����� ������� ��������, ������� ����, �
//���� ��� ���������� ������ �������� � ������������������.
public class Z7138 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("������� �����");
		 	int a,num=0;
		 	boolean proverochkaNaNolik=false;
		 	while (s.hasNextInt()) {
		 		a=s.nextInt();
		 		num++;
		 		if (a==0) {
		 			System.out.println("������� �������� �������� ������������� ����� "+num);
		 			proverochkaNaNolik=true;
		 		}
		 		
		 	}
		 	if(proverochkaNaNolik==false) System.out.println("0");
		 	s.close();
	 }
}
//done