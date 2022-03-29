import java.util.Scanner;
import java.util.regex.*;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p = Pattern.compile("([a-z]{1,10})\\.([a-z]{2,20})(?:\\.([0-9]{4}))?\\@(alumnos\\.)?urjc\\.es");
        Matcher m = p.matcher(text);
        while(m.find()){
            if((m.group(3) == null) && (m.group(4) == null)){
                System.out.println("profesor "+m.group(1)+" apellido "+m.group(2));
            }else{
                System.out.println("alumno "+m.group(2)+" matriculado en "+m.group(3));
            }
        }
    }
}