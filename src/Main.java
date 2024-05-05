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
        System.out.println(calculateDeliveryDistance(94));
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
            return "год - високосный год";
        } else {
            return "год - не високосный год";
        }
    }

    public static int calculateDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}