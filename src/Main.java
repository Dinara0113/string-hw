public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        System.out.println("Task 2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());

        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е"));



    }
}