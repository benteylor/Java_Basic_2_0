package suite01;

import java.util.Scanner;

public class VI_Calculator {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Num1:");         // подсказка, что нужно ввести значение
        int num1 = scan.nextInt();                     // таким образом можно получить первое число от пользователя

        System.out.print("Enter second Num2:");        // подсказка, что нужно ввести значение
        int num2 = scan.nextInt();                     // таким образом можно получить первое число от пользователя

        int num3 = num1 + num2;                        // задаём условия сложения на основе введённых значений пользователя
        System.out.print("Sum Num1 + Num2 = " + num3); // выводим результат в консоль

    }

}
