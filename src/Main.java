public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2");
        String operationSystem;
        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            operationSystem = "IOS";
        } else {
            operationSystem = "Android";
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию прирложения для " + operationSystem + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке");
        }
        System.out.println("Задача 3");
        int year = 2021;
        if (year < 1584) {
            System.out.println("");
        } else if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит к сезону Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}