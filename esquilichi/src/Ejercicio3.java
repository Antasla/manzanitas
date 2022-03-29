import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* group 1 -> i.gomeze.2019@alumnos.urjc.es
* group 2 -> gomeze
* group 3 -> 2019
* group 4 -> alumnos.urjc.es
* group 5 -> raul.martin@urjc.es
* group 6 -> raul
* group 7 -> martin
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
            Pattern p = Pattern.compile("\\b([a-z]\\.([a-zA-Z]{2,})\\.([0-9]{4})\\@(alumnos\\.urjc\\.es)\\b)|((\\b[a-zA-Z]{1,})\\.([a-zA-Z]{1,})\\@urjc\\.es\\b)\\b");
            Matcher m = p.matcher(line);
            while(m.find()){
                if (!(m.group(1) == null)){ // Caso alumno
                    System.out.println("alumno " + m.group(2) + " matriculado en " + m.group(3));
                }else {
                    System.out.println("profesor " + m.group(6) + " apellido " + m.group(7));
                }
            }
    }
}
