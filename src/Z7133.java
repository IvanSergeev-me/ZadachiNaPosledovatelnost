import java.util.Scanner;
//Найти кол-во максимальных членов
public class Z7133 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = -2147483648, i = 0,  a =0;
        //max = мнимальному числу типа инт
        while (s.hasNextInt()) {
            System.out.println("Вводите числа");
            a = s.nextInt();
            if (a > max) {
                max = a;
                i = 0;
            }

            if (a == max) {
                i++;
            }
            System.out.println("Количество максимальных элементов = " + i);
        }
        System.out.println(i);
        s.close();
    }
   
}
//done