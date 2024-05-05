import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2021; //этот год указан в задании
        String chechedYear = checkYearLeapAndPrint(year);
        System.out.println(chechedYear);

        System.out.println("Task 2");
        int clientOs = 1;
        int clientDeviceYear = 2024;
        System.out.println(validateDeviceAndYear(clientOs, clientDeviceYear));

        System.out.println("Task 3");
        System.out.println(calculateDeliveryDistance(101));
    }

    private static String validateDeviceAndYear(int deviceType, int year) {
        int currentYear = LocalDate.now().getYear();
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

    private static String checkYearLeapAndPrint(int leapYear) {
        boolean leapYearConditions = (leapYear % 400 == 0) || (leapYear % 4 == 0 && leapYear % 100 != 0);
        boolean validYear = leapYear >= 1584;
        if (validYear && leapYearConditions) {
        } else {
        }
        return null;
    }

    private static String calculateDeliveryDistance(int distance) {
        if (distance > 100) {
            return "Wrong distance";
        } else {
            int i = (int) Math.ceil((double) ((distance - 20) / 40) + 1);
            return i + "";
        }
    }

}