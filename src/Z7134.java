import java.util.Scanner;
//Найти кол-во различных квадратов
public class Z7134 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0,  a, sameSquare=-1 ;
      
        while (s.hasNextInt()) {
            System.out.println("Вводите числа");
            a = s.nextInt();
            a=(int)Math.pow(a,2);
           if(a!=sameSquare) {
        	   sameSquare=a;
        	   i++;
        	   }
           else {
        	   i=0;
           }
           System.out.println("Кол-во различных квадратов="+i);
        }
        System.out.println(i);
        s.close();
    }
   
}
//не решено!