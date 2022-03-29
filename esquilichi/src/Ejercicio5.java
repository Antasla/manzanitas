import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
    //  Grupo 0 -> Todito
    //  Grupo 1 -> INFO
    //  Grupo 2 -> main
    //  Grupo 3 -> Main
    //  Grupo 4 -> Toodo el log
    public static void main(String[] args) {
        String nuevo;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Pattern p = Pattern.compile("\\b\\d+-\\d+-\\d+ +\\d+:\\d+:\\d+\\.\\d+ +(\\w+) +\\d+ +--- +\\[(?: +)?([a-zA-Z0-9]+)(?: +)?] +(?:[a-zA-Z0-9\\.]+\\.([a-zA-Z0-9]+)|([a-z-A-Z0-9]+)) +\\: +(.*)");
        Matcher m = p.matcher(line);
        while(m.find()){
            if (m.group(3) == null){
                nuevo = m.group(4);
            } else {
                nuevo = m.group(3);
            }
            System.out.println("\"" + m.group(1) + "\"" + ","
                    + "\"" + m.group(2) + "\"" + "," +
                    "\"" + nuevo + "\""
                    + "," + "\"" + m.group(5) + "\"");
        }
    }
}

