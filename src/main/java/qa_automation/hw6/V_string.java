package qa_automation.hw6;

public class V_string {

    public static void main(String[] args) {

        String a = "Hello_World!";

        int length = a.length();
        System.out.println(length);

        int b = length/2;
        System.out.println(b);

        char c = a.charAt(b);
        char d = a.charAt(b - 1);
        System.out.println("" + c + d);



    }
}
