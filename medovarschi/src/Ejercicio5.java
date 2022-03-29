import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    grupo 1 -> INFO
    grupo 2 -> main
    grupo 3 -> Main
    grupo 4 -> Starting ...
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p = Pattern.compile("\\b([INFO]).*([main]).*([A-Za-z]{1,})(.*\\n.*\\n.*)\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group(1) + "," + m.group(2) + "," + m.group(3) + "," + m.group(4));
        }
    }
}
