import java.util.Scanner;
import java.util.regex.*;
class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern p = Pattern.compile("(\\s|\\b)\\d{4}(\\s|\\b)");
        Matcher m = p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}