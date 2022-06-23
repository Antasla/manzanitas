import java.util.Scanner;
import java.util.regex.*;


/*
* i.kadiri.2018@alumnos.urjc.es
* Grupo 1 - kadiri
* Grupo 2 - 2018
* Grupo 3 - alumnos.urjc.es
* imnae.kadiri@urjc.es
* Grupo 4 - imane
* Grupo 5 - kadiri
* */
public class Ejercicio3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        Pattern p = Pattern.compile("\\b[a-zA-Z]?(?:[a-z]{1}\\.([a-z]{2,})\\.(\\d{4})(@alumnos\\.urjc\\.es))|(?:([a-z]+)\\.([a-z]+)@urjc\\.es)\\b");
        Matcher m = p.matcher(line);
        while(m.find()){
            if(m.group(3)==null) {
                System.out.println("profesor " + m.group(4) + " apellido " + m.group(5));
            }else {
                System.out.println("alumno " + m.group(1) + " matriculado en " + m.group(2));
            }
        }
    }
}


