package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println(validatePass("amerca1@"));
        System.out.println(validatePass("amrca154682"));
    }
    public static String validatePass(String pass){
        String passRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&]).{8,}$";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches() ? "VALIDO" : "INVALIDO";
    }
}
