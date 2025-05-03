package suite02;

import java.util.Arrays;

public class IV_string {

    public static void main(String[] args) {

    /* Методы String используются, для проверки текста. Если взять за основу то, что String - это предложение которое.
    То метод String даёт возможность взаимодействовать с этим предложением в целом и посимвольно. Сравнивать, изменять
    осуществлять поиск и тд. */

        /* int length(): */
        // Возвращает длину строки, то есть количество символов, которые она содержит. Может использоваться для проверки длины текста на экране
        // (например, максимальное количество символов в поле ввода).
        String text = "Hello";
        int length = text.length(); // length будет равен 5
        System.out.println("length: " + length);

        /* boolean equals(Object anObject): */
        // Сравнивает текущую строку с другой строкой (anotherString) и возвращает true, если они абсолютно идентичны (буква в букву, с учетом регистра),
        // и false в противном случае.
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        boolean isEqual1 = str1.equals(str2); // isEqual1 будет true
        boolean isEqual2 = str1.equals(str3); // isEqual2 будет false
        System.out.println("isEqual1: " + isEqual1);

        /* boolean isEmpty() */
        // Проверяет, является ли строка пустой (имеет длину 0). Возвращает true, если строка пуста, и false в противном случае.
        String empty = "";
        String notEmpty = "Text";
        boolean isEmpty1 = empty.isEmpty(); // isEmpty1 будет true
        boolean isEmpty2 = notEmpty.isEmpty(); // isEmpty2 будет false
        System.out.println("isEmpty1: " + isEmpty1);

        /* char charAt(int index) */
        // Возвращает символ, находящийся по указанному индексу (index) в строке. Индексы начинаются с 0.
        String word = "Hello my friend";
        char firstChar = word.charAt(0); // firstChar будет 'H'
        char tenChar = word.charAt(10); // thirdChar будет 'r'
        System.out.println("firstChar: " + firstChar + " tenChar: " + tenChar);

        /* int indexOf(int ch) */
        // Возвращает индекс первого вхождения указанного символа (ch) в этой строке. Если символ не найден,
        // возвращает -1. (Обрати внимание, что int здесь может принимать как char, так и его Unicode-значение).
        String banana = "banana";
        int index1 = banana.indexOf('a'); // index1 будет 1 (первое 'a')
        int index2 = banana.indexOf('b'); // index2 будет 0
        int index3 = banana.indexOf('x'); // index3 будет -1 (нет такого символа)
        System.out.println(index2);

        /* int indexOf(String str) */
        // Возвращает индекс первого вхождения указанной подстроки (str) в этой строке. Если подстрока не найдена, возвращает -1.
        String text2 = "This is a test string";
        int ind1 = text2.indexOf("is"); // index1 будет 2
        int ind2 = text2.indexOf("test"); // index2 будет 10
        int ind3 = text2.indexOf("example"); // index3 будет -1
        System.out.println("ind1: " + ind1);

        /* String replace(char oldChar, char newChar) */
        // Описание: Возвращает новую строку, в которой все вхождения символа oldChar заменены на символ newChar.
        String apple = "apple";
        String replacedText = apple.replace('p', 'b'); // replacedText будет "abble"
        System.out.println("replacedText: " + replacedText);

        /* boolean startsWith(String prefix) */
        // Проверяет, начинается ли эта строка с указанного префикса (prefix). Возвращает true, если начинается, и false в противном случае.
        String file = "image.jpg";
        boolean startsWithImage = file.startsWith("image"); // startsWithImage будет true
        boolean startsWithDoc = file.startsWith("doc");   // startsWithDoc будет false
        System.out.println("startsWithImage: " + startsWithImage);

        /* boolean endsWith(String suffix) */
        // Проверяет, заканчивается ли эта строка указанным суффиксом (suffix). Возвращает true, если заканчивается, и false в противном случае.
        String files = "report.pdf";
        boolean endsWithPdf = files.endsWith(".pdf"); // endsWithPdf будет true
        boolean endsWithTxt = files.endsWith(".txt"); // endsWithTxt будет false
        System.out.println("endsWithPdf: " + endsWithPdf);

        /* String substring(int beginIndex) */
        // Возвращает новую строку, которая является подстрокой этой строки, начиная с указанного индекса beginIndex и до конца строки.
        // Используется для извлечения части текста для дальнейшей проверки
        String hw = "Hello world";
        String sub = hw.substring(6); // sub будет "world" (индекс 6 - это 'w')
        System.out.println("sub: " + sub);

        /* String substring(int beginIndex, int endIndex) */
        // Возвращает новую строку, которая является подстрокой этой строки, начиная с индекса beginIndex (включительно) и заканчивая индексом endIndex (исключительно).
        String hwall = "Hello world";
        String beginend = hwall.substring(0, 5); // sub будет "Hello" (от индекса 0 до 5, не включая 5)
        System.out.println("beginend: " + beginend);

        /* char[] toCharArray() */
        // Преобразует эту строку в новый массив символов (char[])
        String java = "Java";
        char[] chars1 = java.toCharArray(); // chars будет ['J', 'a', 'v', 'a']
        System.out.println("chars: " + Arrays.toString(chars1));

        /* String trim() */
        // Возвращает новую строку, которая является копией этой строки с удаленными начальными и конечными пробелами.
        // Очень полезен для очистки текста, полученного с экрана, от случайных пробелов перед сравнением с ожидаемым значением.
        String textWithSpaces = "  some text  ";
        String trimmedText = textWithSpaces.trim(); // trimmedText будет "some text"

        /* int compareTo(String anotherString) */
        // Сравнивает эту строку с другой строкой (anotherString) лексикографически (в словарном порядке).
        // Возвращает:
        // - отрицательное значение, если текущая строка лексикографически меньше, чем anotherString.
        // - положительное значение, если текущая строка лексикографически больше, чем anotherString.
        // - 0, если строки равны.
        String str10 = "apple";
        String str20 = "banana";
        String str30 = "apple";
        int result1 = str10.compareTo(str2); // result1 будет отрицательным
        int result2 = str20.compareTo(str1); // result2 будет положительным
        int result3 = str30.compareTo(str3); // result3 будет 0
















    }
}
