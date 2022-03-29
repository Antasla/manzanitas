import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        Pattern p = Pattern.compile("\\b[a-zA-Z]?\\d{4}[a-zA-Z]?\\b");
        Matcher m = p.matcher(line);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
