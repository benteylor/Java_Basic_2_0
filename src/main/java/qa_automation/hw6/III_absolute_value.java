package qa_automation.hw6;

public class III_absolute_value {

    public static void main(String[] args) {

        int a = 5;
        int b = -11;

        double absolute_value_1 = Math.abs(a);
        double absolute_value_2 = Math.abs(b);


        if (absolute_value_1 > absolute_value_2) {
            System.out.println("absolute value 'a' is greater than absolute value 'b' ");

        } else if (absolute_value_1 < absolute_value_2) {
            System.out.println("absolute value 'b' is greater than absolute value 'a' '");

        } else {
            System.out.println("absolute value is equal");
        }
    }
}





