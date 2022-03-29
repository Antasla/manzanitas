import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    grupo 1 -> C/ o Calle
    grupo 2 -> Dulcinea
    grupo 3 -> N
    grupo 4 -> 10
    grupo 5 -> 28926
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p = Pattern.compile("\\b([C][\\/]|Calle)\\s([A-ZÑÁÉÍÓÚ]{1}[a-zñáéíóú]{1,})[,]?\\s+([nN]|[nN]º|[nN\\s]|[nN\\s]º)?\\s?([0-9]{1,})[,]\\s+([0-9]{5})\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group(5) + "-" + m.group(2) + "-" + m.group(4));
        }
    }
}
