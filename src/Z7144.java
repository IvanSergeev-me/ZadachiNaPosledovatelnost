import java.util.Scanner;
//�������� ���������, �������� ������������������
//�� ����� � ������, ���������� ����� ����� �� ������, ����������� ��-
//����. ��� ������ 143!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Z7144 {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("������� �����");
		 	int a,k=0;
		 	a=s.nextInt();
		 	 while (s.hasNextInt()) {
		 		 a=s.nextInt();
		 		 if ((a!=0)&&(a!=1))break;
		 		 if (a == 0 ) {
		 			 k++; 
		 			
		 		 }
		 	
		 	
		 	 }
		 	
		 	System.out.println("����� ����� �� 1, ����������� �����= "+k);
		 	
		 s.close();	
	 }
}
//�� ������