import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * i.kadiri.2018@alumnos.urjc.es
 * Grupo 1 - INFO
 * Grupo 2 - [main]
 * Grupo 3 - Main
 * Grupo 4 - log
 * */

public class Ejercicio5 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        Pattern p = Pattern.compile("\\b\\d{4}-\\d{2}-\\d{2} +\\d{2}:\\d{2}:\\d{2}\\.\\d+ +(.+) +\\d+ +--- +\\[(.+)\\] +(?:(?:\\w+)\\.(\\w+)|(\\w+)) +: +(.*)");
        Matcher m = p.matcher(line);
        while(m.find()){
            System.out.println("\"" + m.group(1) + "\"" + "," +
                    "\"" + m.group(2) + "\"" + "," +
                    "\"" + m.group(3) + "\"" + "," +
                    "\"" + m.group(5) + "\"" + ",");
        }
    }
}
