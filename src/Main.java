import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 1584;
        checkYearLeapAndPrint(year);

        System.out.println("Task 2");
        int clientOs = 1;
        int clientDeviceYear = 2024;
        System.out.println(validateDeviceAndYear(clientOs, clientDeviceYear));

        System.out.println("Task 3");
        System.out.println(calculateDeliveryDistance(101));
    }

    private static String validateDeviceAndYear(int deviceType, int year) {
        int currentYear = 2015;
        if (deviceType == 0 && year < currentYear) {
            return "Установите облегченную версию приложения для IOS по ссылке";
        } else if (deviceType == 0 && year >= currentYear) {
            return "Установите версию приложения для IOS по ссылке";
        } else if (deviceType == 1 && year < currentYear) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else if (deviceType == 1 && year >= currentYear) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Такая система не поддерживается";
        }

    }

    private static void checkYearLeapAndPrint(int leapYear) {
        boolean leapYearConditions = (leapYear % 400 == 0) || (leapYear % 4 == 0 && leapYear % 100 != 0);
        boolean validYear = leapYear >= 1584;
        if (validYear && leapYearConditions) {
            System.out.printf("%s год - високосный год", leapYear);
        } else {
            System.out.printf("%s год - не високосный год", leapYear);
        }
    }

    private static String calculateDeliveryDistance(int distance) {
        if (distance > 100) {
            return "Wrong distance";
        } else {
            int i = (int) Math.ceil((double) (distance - 20 / 40) + 1);
            return i + "";
        }
    }

}