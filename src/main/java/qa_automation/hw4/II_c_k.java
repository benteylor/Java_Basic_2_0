package qa_automation.hw4;

import java.util.Scanner;

public class II_c_k {
    public static void main (String [] args){

        /*подключение класса Scanner происходит путём импорта в хедере import java.util.Scanner
        Scanner - это класс, который даёт возможность взаимодействовать с данными, которые вносит пользователь
        чтобы создать объект, после класса Scanner нам необходимо дать название объекту, по типу переменной. в примере scan. Затем =
        после = нам нужно выделить память и значение которое будет приниматься new, Scanner() - является название нашего класса
        в скобках нам нужно передать определённые настройки. в примере это (System.in)
        таким образом мы создали объект, который называется scan, и через этот объект мы сможем получать информацию от пользователя*/
        Scanner scan = new Scanner(System.in);

        System.out.print("Внесите данные по Цельсию: "); // вносим данные пользователя

         /*для того, что бы от пользователя получить число, необходимо объявить переменную
        обращаясь к нашему объекту scan, чез точку(.), задаём один из методов next,
        все эти методы дают возможность получить определённое число от пользователя,
        которое сразу конвертируется в этот же тип данных*/

        double num1 = scan.nextDouble(); // обрабатываем данные пользователя для дальнейшего переиспользования

        double num2 = (num1*9/5)+32;     // формула расчёта температуры по Фаренгейта с учётом градусов Цельсия

        double num3 = num1+273.15;       // формула расчёта температуры по Кельвину с учётом градусов Цельсия

        System.out.print("Фаренгейт = " + num2 +" /");

        System.out.print(" Кельвин = " + num3);

    }
}
