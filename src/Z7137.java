import java.util.Scanner;
//�������� ���������, �������� ������������������
//����� �����, � ���������� ������ ������� � ���������� �� ���������-
//��� ���������.
public class Z7137 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("������� �����");
		    int max =-2147483648, a, count = 0, perv=0, lastMax=0;
		    while (s.hasNextInt()) {
		         a = s.nextInt();
		         count++;
		         if (a>max) {
		             max = a;
		             perv = count;
		         }
		         if (a==max) lastMax = count;
		        

		         System.out.println("������ ������������ ����� = " + perv);
		         System.out.println("��������� ������������ ����� = " + lastMax );

		     }
		     System.out.println("������ ������������ ����� = " + perv);
		     System.out.println("��������� ������������ ����� = " + lastMax);
		     s.close();
	 }
	 
}

//(He) ������