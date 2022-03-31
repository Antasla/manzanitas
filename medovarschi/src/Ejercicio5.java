import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    grupo 1 -> INFO
    grupo 2 -> main
    grupo 4 -> Main
    grupo 5 -> Starting ...
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p = Pattern.compile("([A-Za-z]{1,}).*\\[(.*)\\].*([.]|\\s)([A-Za-z0-9]{1,})\\s+[:]\\s+(.*)");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("\"" + m.group(1) + "\",\"" + m.group(2) + "\",\"" + m.group(4) + "\",\"" + m.group(5) + "\"");
        }
    }
}
