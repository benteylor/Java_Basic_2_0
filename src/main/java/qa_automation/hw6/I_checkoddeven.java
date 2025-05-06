package qa_automation.hw6;

import java.util.Scanner;

public class I_checkoddeven {

    public static void main (String [] args) {

        int firstnumber = 10;

        if (firstnumber % 2 == 0) { //для вычисления чётного/не чётного, проверяем значение на остаток: % 2 == 0
            System.out.println("The number is Even number," + " BYE");


        } else {
            System.out.println("The number is Odd number," + " BYE");

            return;

        }

    }

}
