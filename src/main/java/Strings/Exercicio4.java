package Strings;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println(FormatDate(21,13, 2022));
    }

    public static String FormatDate(int day, int month, int year){
        String dateFormatted = String.format("%02d/%02d/%04d", day, month, year);
        return validateDate(dateFormatted) ? dateFormatted : "Data em formato incorreto";
    }
    public static boolean validateDate(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[012])\\/(19|20)\\d\\d$";
        return date.matches(regex);
    }
}
