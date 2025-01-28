package Strings;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println(removeNonDigits("70s3.95r5.614a-69"));
    }

    public static String removeNonDigits(String cpf){
        String cpfRegex = "\\D";
        return cpf.replaceAll(cpfRegex, "");
    }
}
