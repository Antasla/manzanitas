import java.util.Scanner;
import java.util.regex.*;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p = Pattern.compile("([A-Z]+).*\\[(.+)\\].{0,10}(?:(?:\\.|\\s)([A-z]+))\\s*:\\s*((?:(?:\\s|\\S))+)");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println("\""+m.group(1)+"\",\""+m.group(2)+"\",\""+m.group(3)+"\",\""+m.group(4)+"\"");
        }
    }
}
