import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Grupo 1 - Dulcinea
* Grupo 2 - 10
* Grupo 3 - 28002
* */

public class Ejercicio4 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        Pattern p = Pattern.compile("\\b[a-zA-Z]?(?:C\\/ |Calle )([A-ZÁÉÍÓÚ\\u00d1][a-záéíóú\\u00f1]+),?\\s+?(?:[nN]º|[nN]º |[nN] |[nN])?(\\d+),\\s+(\\d{5})\\b");
        Matcher m = p.matcher(line);
        while(m.find()){
            System.out.println(m.group(3)+"-"+m.group(1)+"-"+m.group(2));
        }
    }
}
