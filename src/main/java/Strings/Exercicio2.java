package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o email? ");
        String email = scanner.next();
        System.out.println(extractEmailInformation(email));
    }

    public static String extractEmailInformation(String email){
        if (validateEmail(email)){
            String[] dataSplit = email.split("@");
            String domain = isBrasilianDomain(dataSplit[1]);
            return "User: " + dataSplit[0] + "\nDominio: " + dataSplit[1] + "\nBrasileiro: " + domain;
        }else {
            return "Email invalido";
        }
    }

    public static boolean validateEmail(String email){
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static String isBrasilianDomain(String domain){
        return domain.endsWith(".br") ? "sim" : "não";
    }
}
