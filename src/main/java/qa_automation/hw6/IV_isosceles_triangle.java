package qa_automation.hw6;

public class IV_isosceles_triangle {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 5;

        if ((a == b) && (b == c)) {
            System.out.println("isosceles triangle");
        } else {
            System.out.println("not isosceles triangle");
        }
    }
}
