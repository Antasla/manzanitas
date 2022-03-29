import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* grupo 1 -> i.lozanoo.2015@alumnos.urjc.es
   grupo 2 -> lozanoo
   grupo 3 -> 2015
   grupo 4 -> isaac.lozano@urjc.es
   grupo 5 -> isaac
   grupo 6 -> lozano
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p = Pattern.compile("\\b([a-zA-Z]{1}[.]([a-zA-Z]{2,})[.]([0-9]{4})@alumnos\\.urjc\\.es)|(([a-zA-Z]{2,})[.]([a-zA-Z]{2,})@urjc\\.es)\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            if (m.group(1) != null) {
                System.out.println("alumno " + m.group(2) + " matriculado en " + m.group(3));
            } else {
                System.out.println("profesor " + m.group(5) + " apellido " + m.group(6));
            }
        }
    }
}
