import java.util.Scanner;
//����� ������� �������������� ������������ �����
public class Z7135 {
	
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 	System.out.println("������� �����");
			double sum = s.nextDouble();
			double k = 1;
			double last;
			while (s.hasNextDouble()) {
				last = s.nextDouble();
				sum=sum+last;
				k++;
			}
			System.out.println(sum/k);
			s.close();
	 }
}
