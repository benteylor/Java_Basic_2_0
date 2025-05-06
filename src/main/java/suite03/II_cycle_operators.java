package suite03;

public class II_cycle_operators {

    public static void main(String[] args) {

        for ( int i = 1; i <= 10; i++ ) {

            if (i == 8)
                break;       // - оператор, который при условии if останавливает работу программы

            if ( i % 2 == 0 )//- парные числа
                continue;    // - оператор, который пропускает итерацию, при условии if

            System.out.println(i);

        }
    }
}
