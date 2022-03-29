import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// \b(C\/|Calle) ([A-Z]{1}[a-zA-Z]{1,}),? ([nN]\d+|[nN] \d+|\d+|\d+|[nN]º\d+|[nN]º \d+),[ ]+([0-9]{5})

/*
Grupo 1 -> Calle
Grupo 2 -> Dulcinea
Grupo 3 -> N10
Grupo 4 -> 28091
La Calle es a-zA-Z? Duda a preguntar
codigo postal madrid empiezan por 28!!!!
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String nuevo;
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        Pattern p = Pattern.compile("\\b(C\\/|Calle) ([A-ZÁÉÍÓÚ\\u00d1]{1}[a-zA-ZáéíóúÁÉÍÓÚ\\u00f1\\u00d1]{1,}),? +?(?:[nN]|[nN] |[nN]º|[nN]º )?(\\d+), +([0-9]{5})\\b");
        Matcher m = p.matcher(line);
        while(m.find()){
            nuevo = m.group(3);
            System.out.println(m.group(4) + "-" + m.group(2) + "-" + nuevo);
        }
    }
}
