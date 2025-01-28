package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é a data?");
        String date = scanner.next();
        System.out.println(extractDate(date));
    }

    public static DateInfo extractDate(String date) {
        if (isValidDate(date)) {
            String[] dateSplit = date.split("/");
            DateInfo dateInfo = new DateInfo(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]), Integer.parseInt(dateSplit[2]));
            return dateInfo;
        } else {
            return null;
        }
    }

    public static boolean isValidDate(String date) {
        String dateRegex = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[012])\\/(19|20)\\d\\d$";
        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    static class DateInfo {
        int day;
        int month;
        int year;

        public DateInfo(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Dia: " + day + "\nMês: " + month + "\nAno: " + year;
        }

    }

}
