import java.util.Scanner;
//�������� ���������, �������� ������������������
//����� �����, � ���������� ������ �� �������� �� ������� � No, ����
//������ �������� ���.
public class Z7140 {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("������� �����");
		 	int a,firstMax,secondMax;
		 	a=s.nextInt();
		 	firstMax=a;
		 	secondMax=-2147483648;
		 	while (s.hasNextInt()) {
		 		a = s.nextInt();
	            if (a > firstMax) {
	            	secondMax=firstMax;
	                firstMax = a;
	                
	            }
	            if (a>secondMax&&a<firstMax) secondMax=a;
	        
		 		
		 	}
		 	if (secondMax!=-2147483648) {
		 		 System.out.println("������ ��������="+secondMax);
		 	}
		 	else System.out.println("0");
		 	
		 	s.close();

	 }
		 
}
//done