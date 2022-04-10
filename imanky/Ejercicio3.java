import java.util.Scanner;
import java.util.regex.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        Pattern p = Pattern.compile("((\\b[a-zA-Z]{1,})\\.([a-zA-Z]{1,})\\b(@urjc)\\.es\\b)|(\\b[a-z]{1}\\.([a-zA-Z]{2,})\\.(\\d{4})\\@(alumnos)\\.urjc\\.es\\b)");
        Matcher m = p.matcher(line);
        while(m.find()){
            if(m.group(3)!=null) {
                System.out.println("profesor " + m.group(1) + " apellido " + m.group(2));
            }else {
                System.out.println("alumno " + m.group(4) + " matriculado en " + m.group(5));
            }
        }
    }
}


