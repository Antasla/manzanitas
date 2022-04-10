import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        Pattern p = Pattern.compile("\\b(E\\-|E)?(-| |)?\\d{4}(-| |)?[A-Z]{3}\\b");
        Matcher m = p.matcher(line);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
