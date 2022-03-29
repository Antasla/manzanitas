//import java.util.Scanner;
//import java.util.regex.*;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String text = sc.nextLine();
//        Pattern p = Pattern.compile("(?:C\\/|Calle)\\s(?:(?:de\\s|la\\s|el\\s)+)?((?:[A-Z]|Ñ)(?:[a-z]|[áéíóú]|[ÁÉÍÓÚ]|ñ){1,100}),?\\s+(?:Nº|N\\s|\\s|Nº\\s|n|N)?([0-9]{1,3}),\\s+([0-9]{5})");
//        Matcher m = p.matcher(text);
//        while(m.find()){
//            System.out.println(m.group(3)+"-"+m.group(1)+"-"+m.group(2));
//        }
//    }
//}
